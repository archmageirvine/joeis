package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030385 (# 2's)-(# 3's) in first n terms of s=A030373.
 * @author Sean A. Irvine
 */
public class A030385 extends A030373 {

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

