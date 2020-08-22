package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022007 Initial members of prime quintuplets (p, p+4, p+6, p+10, p+12).
 * @author Sean A. Irvine
 */
public class A022007 extends A022005 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(10).isProbablePrime() && p.add(12).isProbablePrime()) {
        return p;
      }
    }
  }
}

