package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A067025 Exponents of prime-powers corresponding to terms of A053705(n)+2.
 * @author Sean A. Irvine
 */
public class A067025 extends A025475 {

  @Override
  public Z next() {
    while (true) {
      final Z pk = super.next();
      final Z a = pk.subtract(2);
      if (a.isProbablePrime()) {
        pk.isPower();
        return Z.valueOf(pk.auxiliary());
      }
    }
  }
}
