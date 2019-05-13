package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022008 Initial members of prime sextuplets <code>(p, p+4, p+6, p+10, p+12, p+16)</code>.
 * @author Sean A. Irvine
 */
public class A022008 extends A022007 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(16).isProbablePrime()) {
        return p;
      }
    }
  }
}

