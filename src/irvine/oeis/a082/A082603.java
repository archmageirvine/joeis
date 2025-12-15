package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082603 a(n) is the first prime greater than a(n-1) such that a(n)*a(n-1)+2 is a prime, with a(1)=3.
 * @author Sean A. Irvine
 */
public class A082603 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
      return Z.THREE;
    }
    Z t = mA;
    while (true) {
      t = Functions.NEXT_PRIME.z(t);
      if (t.multiply(mA).add(2).isProbablePrime()) {
        mA = t;
        return mA;
      }
    }
  }
}
