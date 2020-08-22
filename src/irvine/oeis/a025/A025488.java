package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025488 Number of distinct prime signatures of the positive integers up to 2^n.
 * @author Sean A. Irvine
 */
public class A025488 extends A025487 {

  private long mSignatures = 0;
  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mSignatures;
    } while (super.next().compareTo(mLimit) < 0);
    mLimit = mLimit.multiply2();
    return Z.valueOf(mSignatures);
  }
}

