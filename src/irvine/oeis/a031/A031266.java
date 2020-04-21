package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031266 <code>a(n)=(# 1's)-(# 2's)</code> in first n terms of <code>A031253</code>.
 * @author Sean A. Irvine
 */
public class A031266 extends A031253 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 1) {
      mSum = mSum.add(1);
    } else if (t == 2) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

