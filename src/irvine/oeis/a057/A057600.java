package irvine.oeis.a057;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000959;
import irvine.util.string.StringUtils;

/**
 * A05600.
 * @author Sean A. Irvine
 */
public class A057600 extends A000959 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Z> mLucky = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean isLucky(final Z n) {
    while (mLucky.isEmpty() || mLucky.last().compareTo(n) < 0) {
      mLucky.add(super.next());
    }
    return mLucky.contains(n);
  }

  private boolean isLucky(final FactorSequence fs) {
    for (final Z d : fs.divisors()) {
      if (!isLucky(d)) {
        return false;
      }
    }
    return true;
  }

  private Z nextLuckyPrime(Z p) {
    do {
      p = mPrime.nextPrime(p);
    } while (!isLucky(p));
    return p;
  }

  @Override
  public Z next() {
    ++mN;
    Z luckyPrime = Z.ONE;
    final TreeMap<Z, FactorSequence> candidates = new TreeMap<>();
    final FactorSequence fs = new FactorSequence();
    candidates.put(Z.ONE, fs);
    while (true) {
      final TreeMap<Z, FactorSequence> newCandidates = new TreeMap<>();
      luckyPrime = nextLuckyPrime(luckyPrime);
      if (mVerbose) {
        final Map.Entry<Z, FactorSequence> e = candidates.lastEntry();
        StringUtils.message("Testing: " + luckyPrime + " #candidates: " + candidates.size() + " last: " + e.getKey() + " = " + FactorSequence.toString(e.getValue()));
      }
      for (final FactorSequence fs1 : candidates.values()) {
        final FactorSequence fs2 = new FactorSequence(fs1);
        fs2.add(luckyPrime, FactorSequence.PRIME);
        if (isLucky(fs2)) {
          final Z n = fs2.product();
          if (fs2.omega() == mN) {
            return n;
          } else if (fs2.omega() < mN) {
            newCandidates.put(n, fs2);
          }
        }
      }
      candidates.putAll(newCandidates);
    }
  }
}
