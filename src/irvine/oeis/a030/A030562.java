package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030562 (# 1's)-(# 0's) in first n terms of A030548.
 * @author Sean A. Irvine
 */
public class A030562 extends A030548 {

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

