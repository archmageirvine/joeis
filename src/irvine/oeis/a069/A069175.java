package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a066.A066388;

/**
 * A069175 Numbers k such that k-1, k+1, 2*k-1, 2*k+1, 4*k-1 and 4*k+1 are all prime.
 * @author Sean A. Irvine
 */
public class A069175 extends A066388 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p4 = p.multiply(4);
      if (p4.subtract(1).isProbablePrime() && p4.add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}

