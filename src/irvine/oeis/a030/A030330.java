package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030330 (# 1's)-(# 0's) in first n terms of A030324.
 * @author Sean A. Irvine
 */
public class A030330 extends A030324 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.signedAdd(Z.ONE.equals(super.next()), Z.ONE);
    return mSum;
  }
}

