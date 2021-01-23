package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030372 (# 1's)-(# 2's) in first n terms of A030363.
 * @author Sean A. Irvine
 */
public class A030372 extends A030363 {

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

