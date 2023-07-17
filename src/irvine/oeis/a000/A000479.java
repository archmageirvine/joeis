package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000479 Number of 1-factorizations of K_{n,n}.
 * @author Sean A. Irvine
 */
public class A000479 extends A000315 {

  /** Construct the sequence. */
  public A000479() {
    super(0);
  }

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN > 2) {
      mF = mF.multiply(mN - 1);
    }
    return super.next().multiply(mF);
  }
}
