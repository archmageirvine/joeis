package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023999 Absolute value of determinant of <code>n X n</code> matrix whose entries are the integers from 1 to <code>n^2</code> spiraling inward, starting in a corner.
 * @author Sean A. Irvine
 */
public class A023999 implements Sequence {

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

