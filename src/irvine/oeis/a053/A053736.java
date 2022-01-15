package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A053736 Run through primes p; if the digits of p*q (where q is the prime following p) can be rearranged to form one or more primes r, append these primes r to the sequence.
 * @author Sean A. Irvine
 */
public class A053736 extends A000040 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final Z prime = super.next();
      final Permutation perm = Permutation.permuter(prime.multiply(mPrime.nextPrime(prime)));
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          final Z t = Permutation.permToZ(p);
          if (t.isProbablePrime()) {
            mA.add(t);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
