package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023201;

/**
 * A046118 Smallest member of a sexy prime triple: value of p such that p, p+6 and p+12 are all prime, but p+18 is not (although p-6 might be).
 * @author Sean A. Irvine
 */
public class A046118 extends A023201 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(12).isProbablePrime() && !p.add(18).isProbablePrime()) {
        return p;
      }
    }
  }
}
