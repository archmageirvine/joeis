package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024217 a(n) = ( Product {k = 1..n} 3*k - 2 ) * ( Sum {k = 1..n} (-1)^(k+1)/(3*k - 2) ).
 * @author Sean A. Irvine
 */
public class A024217 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    if (++mN < 3) {
      if (mN == 1) {
        return Z.ONE;
      }
    } else {
      final Z t = mB.multiply(3).add(mA.multiply(3 * mN - 5).multiply(3 * mN - 5));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

