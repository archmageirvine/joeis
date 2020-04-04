package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030583 <code>a(n)=(# 2's)-(# 3's)</code> in first n terms of <code>A030567</code>.
 * @author Sean A. Irvine
 */
public class A030583 extends A030567 {

  private Z mSum = Z.ZERO;
  {
    super.next();
  }

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

