package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023999 Absolute value of determinant of n X n matrix whose entries are the integers from 1 to n^2 spiraling inward, starting in a corner.
 * @author Sean A. Irvine
 */
public class A023999 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN > 2) {
      mF = mF.multiply(2 * mN - 3).multiply(2 * mN - 4).divide(mN - 2);
    }
    return mF.multiply(3 * mN - 1);
  }
}

