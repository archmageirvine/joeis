package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030330 <code>(# 1's)-(# 0's)</code> in first n terms of <code>A030324</code>.
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

