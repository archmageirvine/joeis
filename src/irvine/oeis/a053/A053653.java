package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A053653 Number of ways to rearrange digits of prime(n)*prime(n+1) to form a prime.
 * @author Sean A. Irvine
 */
public class A053653 extends A000040 {

  @Override
  public Z next() {
    final TreeSet<Z> res = new TreeSet<>();
    final Z prime = super.next();
    final Permutation perm = Permutation.permuter(prime.multiply(mPrime.nextPrime(prime)));
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        final Z t = Permutation.permToZ(p);
        if (t.isProbablePrime()) {
          res.add(t);
        }
      }
    }
    return Z.valueOf(res.size());
  }
}
