package irvine.oeis.a063;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063721 Number of proper divisors of n is a square and sets a new record for such squares.
 * @author Sean A. Irvine
 */
public class A063721 extends Sequence1 {

  private Z mPrev = Z.NEG_ONE;
  private final Fast mPrime = new Fast();
  private final TreeMap<Z, FactorSequence> mA = new TreeMap<>();
  {
    mA.put(Z.ONE, Jaguar.factor(1));
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, FactorSequence> e = mA.pollFirstEntry();
      final Z n = e.getKey();
      final FactorSequence fs = e.getValue();
      int prevExponent = Integer.MAX_VALUE;
      Z q = Z.ONE;
      for (final Z p : fs.toZArray()) {
        final int k = fs.getExponent(p);
        if (k < prevExponent) {
          final FactorSequence fsk = new FactorSequence(fs);
          fsk.add(p, FactorSequence.PRIME, 1);
          mA.put(n.multiply(p), fsk);
        }
        prevExponent = k;
        q = p;
      }
      q = mPrime.nextPrime(q);
      final FactorSequence fsq = new FactorSequence(fs);
      fsq.add(q, FactorSequence.PRIME, 1);
      mA.put(n.multiply(q), fsq);
      final Z s = fs.sigma0().subtract(1);
      if (s.compareTo(mPrev) > 0 && s.isSquare()) {
        mPrev = s;
        return n;
      }
    }
  }
}

