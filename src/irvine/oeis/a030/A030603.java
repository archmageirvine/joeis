package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030603 (# 3's)-(# 4's) in first n terms of A030588.
 * @author Sean A. Irvine
 */
public class A030603 extends A030588 {

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

