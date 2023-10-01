package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066076 Primes p such that there is a unique solution to p = sigma(x) - 1.
 * @author Sean A. Irvine
 */
public class A066076 extends A066075 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.ONE)) {
        return Z.valueOf(mP);
      }
    }
  }
}
