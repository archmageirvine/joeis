package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030565 <code>(# 3's)-(# 4's)</code> in first n terms of <code>A030548</code>.
 * @author Sean A. Irvine
 */
public class A030565 extends A030548 {

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

