package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a003.A003137;

/**
 * A030340 a(n)=(# 1's)-(# 2's) in first n terms of A003137.
 * @author Sean A. Irvine
 */
public class A030340 extends A003137 {

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

