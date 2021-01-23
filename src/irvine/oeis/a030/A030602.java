package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030602 a(n)=(# 1's)-(# 2's) in first n terms of A030588.
 * @author Sean A. Irvine
 */
public class A030602 extends A030588 {

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

