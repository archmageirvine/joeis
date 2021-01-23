package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022006 Initial members p of prime quintuplets (p, p+2, p+6, p+8, p+12).
 * @author Sean A. Irvine
 */
public class A022006 extends A022004 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(8).isProbablePrime() && p.add(12).isProbablePrime()) {
        return p;
      }
    }
  }
}

