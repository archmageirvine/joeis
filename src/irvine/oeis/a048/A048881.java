package irvine.oeis.a048;
// manually 2026-10-14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A048881 a(n) = A000120(n+1) - 1 = wt(n+1) - 1.
 * @author Georg Fischer
 */
public class A048881 extends AbstractSequence implements DirectSequence {

  private long mN;

  /** Construct the sequence. */
  public A048881() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return a(++mN);
  }


  @Override
  public Z a(final Z n) {
    return Functions.DIGIT_SUM.z(2, n.add(1)).subtract(Z.ONE);
  }

  @Override
  public Z a(final long n) {
    return Functions.DIGIT_SUM.z(2, n + 1).subtract(Z.ONE);
  }

}
