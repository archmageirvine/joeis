package irvine.oeis.a099;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A099399 Denominators of rationals (in lowest terms) used in a certain high temperature expansion.
 * @author Georg Fischer
 */
public class A099399 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A099399() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return new Q(Functions.CATALAN.z((long) mN), (mN == 0) ? Z.ONE : Z.ONE.shiftLeft(2L * mN - 1).multiply(mN + 2)).den();
  }
}
