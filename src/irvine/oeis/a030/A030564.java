package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030564 (# 2's)-(# 3's) in first n terms of A030548.
 * @author Sean A. Irvine
 */
public class A030564 extends A030548 {

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

