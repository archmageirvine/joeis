package irvine.oeis.a225;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A225035 Primes such that at least one nontrivial permutation of its digits is prime.
 * @author Sean A. Irvine
 */
public class A225035 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final Permutation perm = Permutation.permuter(prime);
      int[] p;
      while ((p = perm.next()) != null) {
        final Z t = Permutation.permToZ(p);
        if (!t.equals(prime) && t.isProbablePrime()) {
          return prime;
        }
      }
    }
  }
}
