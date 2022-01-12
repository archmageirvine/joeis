package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A053652 Primes for which some rearrangement of the digits (leading zeros not allowed) is the product of two consecutive primes.
 * @author Sean A. Irvine
 */
public class A053652 extends A000040 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final int len = mP.multiply(mPrime.nextPrime(mP)).toString().length();
      do {
        final Permutation perm = Permutation.permuter(mP.multiply(mPrime.nextPrime(mP)));
        int[] p;
        while ((p = perm.next()) != null) {
          if (p[0] != 0) {
            final Z t = Permutation.permToZ(p);
            if (t.isProbablePrime()) {
              mA.add(t);
            }
          }
        }
        mP = super.next();
      } while (mP.multiply(mPrime.nextPrime(mP)).toString().length() == len);
    }
    return mA.pollFirst();
  }
}
