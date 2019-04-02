package irvine.oeis.a077;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A077215 Prime power with largest index that divides the product of composite numbers between successive primes with a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A077215 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  private FactorSequence composite() {
    final FactorSequence fs = Cheetah.factor(1);
    final long next = mPrime.nextPrime(mP);
    for (long k = mP + 1; k < next; ++k) {
      final FactorSequence w = Cheetah.factor(k);
      for (final Z z : w.toZArray()) {
        fs.add(z, w.getStatus(z), w.getExponent(z));
      }
    }
    mP = next;
    return fs;
  }

  @Override
  public Z next() {
    final FactorSequence fs = composite();
    int best = 0;
    Z bestz = null;
    for (final Z z : fs.toZArray()) {
      final int e = fs.getExponent(z);
      if (e > best || (e >= best && z.compareTo(bestz) > 0)) {
        best = e;
        bestz = z;
      }
    }
    return bestz == null ? Z.ONE : bestz.pow(best);
  }
}


