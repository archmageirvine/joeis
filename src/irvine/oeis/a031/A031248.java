package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031248 <code>a(n)=(# 1's)-(# 2's)</code> in first n terms of <code>A031235</code>.
 * @author Sean A. Irvine
 */
public class A031248 extends A031235 {

  {
    super.next();
  }

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

