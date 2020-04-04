package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030585 <code>(# 4's)-(# 5's)</code> in first n terms of <code>A030567</code>.
 * @author Sean A. Irvine
 */
public class A030585 extends A030567 {

  private Z mSum = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 4) {
      mSum = mSum.add(1);
    } else if (t == 5) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

