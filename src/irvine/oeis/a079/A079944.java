package irvine.oeis.a079;
// manually 2025-04-01 direct

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a004.A004526;
import irvine.oeis.a030.A030101;

/**
 * A079944 A run of 2^n 0's followed by a run of 2^n 1's, for n=0, 1, 2, ...
 * @author Georg Fischer
 */
public class A079944 extends AbstractSequence implements DirectSequence {

  private int mN;
  private static final DirectSequence A004526 = new A004526();
  private static final DirectSequence A030101 = new A030101();

  /** Construct the sequence. */
  public A079944() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    return Functions.PARITY.z(A004526.a(A030101.a(n.add(2))));
  }

  @Override
  public Z a(final int n) {
    return Functions.PARITY.z(A004526.a(A030101.a(n + 2)));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
