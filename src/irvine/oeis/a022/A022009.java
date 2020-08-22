package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022009 Initial members of prime septuplets (p, p+2, p+6, p+8, p+12, p+18, p+20).
 * @author Sean A. Irvine
 */
public class A022009 extends A022006 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(18).isProbablePrime() && p.add(20).isProbablePrime()) {
        return p;
      }
    }
  }
}

