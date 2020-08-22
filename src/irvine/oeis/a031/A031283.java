package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031283 a(n)=(# 2's)-(# 3's) in first n terms of A031269.
 * @author Sean A. Irvine
 */
public class A031283 extends A031269 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 2) {
      mSum = mSum.add(1);
    } else if (t == 3) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

