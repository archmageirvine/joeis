package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030349 <code>(# 1's)-(# 0's)</code> in first n terms of <code>A030341</code>.
 * @author Sean A. Irvine
 */
public class A030349 extends A030341 {

  private Z mSum = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 1) {
      mSum = mSum.add(1);
    } else if (t == 0) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

