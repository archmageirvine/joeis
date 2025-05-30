package irvine.oeis.a166;
// manually at 2025-05-30

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A166086 Number of times Sum_{i=1..u} J(i,4n+3) obtains value zero when u ranges from 1 to (4n+3). Here J(i,k) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A166086 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A166086() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    int count = -1; // why not 0?
    int sum = 0;
    final int n43 = 4 * n + 3;
    for (int u = 1; u <= n43; u++) {
      sum += Functions.JACOBI.i(u, n43);
      if (sum == 0L) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
