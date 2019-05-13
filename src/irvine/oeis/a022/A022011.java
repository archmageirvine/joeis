package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022011 Initial members of prime octuplets <code>(p, p+2, p+6, p+8, p+12, p+18, p+20, p+26)</code>.
 * @author Sean A. Irvine
 */
public class A022011 extends A022009 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(26).isProbablePrime()) {
        return p;
      }
    }
  }
}

