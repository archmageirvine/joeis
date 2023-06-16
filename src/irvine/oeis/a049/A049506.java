package irvine.oeis.a049;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049506 a(1)=1, a(2)=5, a(n+1) = 2^phi(a(1)*a(2)*...*a(n)) - 3.
 * @author Sean A. Irvine
 */
public class A049506 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.FIVE;
      return Z.FIVE;
    } else {
      final Z t = Z.ONE.shiftLeft(Euler.phi(mA).longValueExact()).subtract(3);
      mA = mA.multiply(t);
      return t;
    }
  }
}

