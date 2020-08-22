package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031284 a(n)=(# 3's)-(# 4's) in first n terms of A031269.
 * @author Sean A. Irvine
 */
public class A031284 extends A031269 {

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

