package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006881;

/**
 * A079797 Products of two primes p and q such that (p*q)^2 + p^2 - q^2 and (p*q)^2 - p^2 + q^2 are both prime.
 * @author Sean A. Irvine
 */
public class A079797 extends A006881 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z p = Functions.LPF.z(t);
      final Z q = t.divide(p);
      final Z t2 = t.square();
      if (t2.add(p.square()).subtract(q.square()).isProbablePrime() && t2.subtract(p.square()).add(q.square()).isProbablePrime()) {
        return t;
      }
    }
  }
}

