package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008464 a(n) = 2^(2n+3) - 2^n*(n+3).
 * @author Sean A. Irvine
 */
public class A008464 extends AbstractSequence {

  /* Construct the sequence. */
  public A008464() {
    super(-1);
  }

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN + 3).subtract(Z.valueOf(mN + 3).shiftLeft(mN));
  }
}
