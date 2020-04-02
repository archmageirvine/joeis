package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030384 <code>a(n)=(# 1's)-(# 2's)</code> in first n terms of <code>s=A030373</code>.
 * @author Sean A. Irvine
 */
public class A030384 extends A030373 {

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

