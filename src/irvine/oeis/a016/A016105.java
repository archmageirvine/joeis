package irvine.oeis.a016;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016105 Blum integers: numbers of the form p * q where p and q are distinct primes congruent to 3 (mod 4).
 * @author Sean A. Irvine
 */
public class A016105 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mSeq = new TreeSet<>();
  private Z mP = Z.TWO;

  private Z nextPrime(Z p) {
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.mod(4) == 3) {
        return p;
      }
    }
  }

  @Override
  public Z next() {
    while (mSeq.isEmpty() || mSeq.first().compareTo(mP) > 0) {
      mP = nextPrime(mP);
      for (Z q = Z.THREE; q.compareTo(mP) < 0; q = nextPrime(q)) {
        mSeq.add(q.multiply(mP));
      }
    }
    return mSeq.pollFirst();
  }
}
