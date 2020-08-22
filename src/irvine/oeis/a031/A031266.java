package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031266 a(n)=(# 1's)-(# 2's) in first n terms of A031253.
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

