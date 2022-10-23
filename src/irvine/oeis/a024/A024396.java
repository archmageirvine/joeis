package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024396 a(n) = ( Product {k = 1..n} 3*k - 1 ) * ( Sum {k = 1..n} (-1)^(k+1)/(3*k - 1) ).
 * @author Sean A. Irvine
 */
public class A024396 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.THREE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if (mN > 2) {
      final Z t = mB.multiply(3).add(mA.multiply(3 * mN - 4).multiply(3 * mN - 4));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
