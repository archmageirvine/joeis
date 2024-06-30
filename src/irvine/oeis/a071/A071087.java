package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071087 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TWO.equals(p)) {
        return Z.ONE; // This is the only case where the sum can be a prime
      }
      final Z s = p.add(mPrime.nextPrime(p));
      final Z t = s.isPower();
      if (t != null && t.isProbablePrime()) {
        return Z.valueOf(s.auxiliary());
      }
    }
  }
}

