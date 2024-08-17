package irvine.oeis.a071;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071829.
 * @author Sean A. Irvine
 */
public class A071837 extends Sequence1 {

  private final TreeMap<Z, FactorSequence> mA = new TreeMap<>();
  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;
  private Z mP2 = Z.NINE;
  {
    // Initialize to avoid is empty checks later
    mA.put(Z.FOUR, fs2(Z.TWO));
  }

  private static FactorSequence fs2(final Z p) {
    final FactorSequence fs = new FactorSequence();
    fs.add(p, FactorSequence.PRIME, 2);
    return fs;
  }

  @Override
  public Z next() {
    while (true) {
      if (mP2.compareTo(mA.firstKey()) < 0) {
        mA.put(mP2, fs2(mP));
        mP = mPrime.nextPrime(mP);
        mP2 = mP.square();
      }
      final Map.Entry<Z, FactorSequence> e = mA.pollFirstEntry();
      // Bump in all possible ways
      final Z n = e.getKey();
      final FactorSequence fs = e.getValue();
      final Z[] p = fs.toZArray();
      final Z r = p[p.length - 1];
      for (Z q = Z.TWO; q.compareTo(r) <= 0; q = mPrime.nextPrime(q)) {
        final int exp = fs.getExponent(q);
        final FactorSequence copy = new FactorSequence(fs);
        final int delta = (int) (mPrime.nextPrime(exp) - exp);
        copy.add(q, FactorSequence.PRIME, delta);
        mA.put(n.multiply(q.pow(delta)), copy);
      }
      int sumExponents = 0;
      for (final Z q : p) {
        sumExponents += fs.getExponent(q);
      }
      if (mPrime.isPrime(sumExponents) && sumExponents == fs.sopf().intValueExact()) {
        return n;
      }
    }
  }
}
