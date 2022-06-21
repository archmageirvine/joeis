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
 * A057600 a(n) is smallest number m such that (m = product of n distinct primes) and all divisors of m are lucky numbers.
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
    final TreeMap<Z, FactorSequence> candidates = new TreeMap<>();
    final FactorSequence fs = new FactorSequence();
    Z p = Z.THREE; // 2 is not lucky
    for (int k = 0; k < mN; p = nextLuckyPrime(p), ++k) {
      fs.add(p, FactorSequence.PRIME);
    }
    candidates.put(fs.product(), fs);
    while (true) {
      final Map.Entry<Z, FactorSequence> e = candidates.pollFirstEntry();
      if (mVerbose) {
        StringUtils.message("Testing: " + e.getKey() + " = " + FactorSequence.toString(e.getValue()));
      }
      if (isLucky(e.getValue())) {
        return e.getKey();
      }
      final Z[] lst = e.getValue().toZArray();
      for (int k = lst.length - 1; k >= 0; --k) {
        final Z q = nextLuckyPrime(lst[k]);
        if (k == lst.length - 1 || q.compareTo(lst[k + 1]) < 0) {
          final FactorSequence fs1 = new FactorSequence();
          for (int j = 0; j < lst.length; ++j) {
            fs1.add(j == k ? q : lst[j], FactorSequence.PRIME);
          }
          candidates.put(e.getKey().divide(lst[k]).multiply(q), fs1);
        }
      }
    }
  }

  // Alternative implementation with much smaller memory
//  @Override
//  public Z next() {
//    ++mN;
//    Z luckyPrime = Z.ONE;
//    final TreeMap<Z, FactorSequence> candidates = new TreeMap<>();
//    final FactorSequence fs = new FactorSequence();
//    candidates.put(Z.ONE, fs);
//    while (true) {
//      final TreeMap<Z, FactorSequence> newCandidates = new TreeMap<>();
//      luckyPrime = nextLuckyPrime(luckyPrime);
//      if (mVerbose) {
//        final Map.Entry<Z, FactorSequence> e = candidates.lastEntry();
//        StringUtils.message("Testing: " + luckyPrime + " #candidates: " + candidates.size() + " last: " + e.getKey() + " = " + FactorSequence.toString(e.getValue()));
//      }
//      for (final FactorSequence fs1 : candidates.values()) {
//        final FactorSequence fs2 = new FactorSequence(fs1);
//        fs2.add(luckyPrime, FactorSequence.PRIME);
//        if (isLucky(fs2)) {
//          final Z n = fs2.product();
//          if (fs2.omega() == mN) {
//            return n;
//          } else if (fs2.omega() < mN) {
//            newCandidates.put(n, fs2);
//          }
//        }
//      }
//      candidates.putAll(newCandidates);
//    }
//  }
}
