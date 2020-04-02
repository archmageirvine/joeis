package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030372 <code>(# 1's)-(# 2's)</code> in first n terms of <code>A030363</code>.
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

