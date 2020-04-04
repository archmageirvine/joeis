package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030618 <code>(# 1's)-(# 2's)</code> in first n terms of <code>A030604</code>.
 * @author Sean A. Irvine
 */
public class A030618 extends A030604 {

  private Z mSum = Z.ZERO;
  {
    super.next();
    super.next();
  }

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

