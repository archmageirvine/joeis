package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031281 a(n)=(# 1's)-(# 0's) in first n terms of A031269.
 * @author Sean A. Irvine
 */
public class A031281 extends A031269 {

  private Z mSum = Z.ZERO;

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

