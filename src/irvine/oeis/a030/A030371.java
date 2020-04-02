package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030371 <code>a(n)=(# 1's)-(# 0's)</code> in first n terms of <code>A030363</code>.
 * @author Sean A. Irvine
 */
public class A030371 extends A030363 {

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

