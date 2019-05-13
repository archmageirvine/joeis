package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022012 Initial members of prime octuplets <code>(p, p+2, p+6, p+12, p+14, p+20, p+24, p+26)</code>.
 * @author Sean A. Irvine
 */
public class A022012 extends A022004 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(12).isProbablePrime()
        && p.add(14).isProbablePrime()
        && p.add(20).isProbablePrime()
        && p.add(24).isProbablePrime()
        && p.add(26).isProbablePrime()) {
        return p;
      }
    }
  }
}

