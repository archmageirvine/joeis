package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031250 <code>(# 3's)-(# 4's)</code> in first n terms of <code>A031235</code>.
 * @author Sean A. Irvine
 */
public class A031250 extends A031235 {

  {
    super.next();
  }

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 3) {
      mSum = mSum.add(1);
    } else if (t == 4) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

