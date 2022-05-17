package irvine.oeis.a103;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A103547 a(n) is the smallest n-digit zeroless prime such that the sum of the two numbers that result from splitting a(n) between any two of its digits is a distinct prime, or 0 if there is no such n-digit prime.
 * @author Sean A. Irvine
 */
public class A103547 implements Sequence {

  private final Fast mPrime = new Fast();
  private final StringBuilder mBase = new StringBuilder("1");
  private final HashSet<Z> mSeen = new HashSet<>();

  private Z shortCircuit(final Z n, final String w, final char digit) {
    final int pos = w.indexOf(digit);
    if (pos != -1 && pos < w.length() - 1) {
      // Short-circuit and jump ahead for any zeros
      final StringBuilder q = new StringBuilder(w.substring(0, pos));
      final char extend;
      final int add;
      if (digit == '9') {
        q.append('9');
        extend = '9';
        add = 1;
      } else {
        q.append((char) (digit + 1));
        extend = '2';
        add = -2;
      }
      for (int k = pos + 1; k < mBase.length(); ++k) {
        q.append(extend);
      }
      return new Z(q).add(add);
    }
    return n;
  }

  @Override
  public Z next() {
    mBase.append('1');
    if (mBase.length() == 2) {
      return Z.valueOf(11);
    }
    final String s = mBase.toString();
    Z n = new Z(s).subtract(Z.ONE);
    while (true) {
      n = mPrime.nextPrime(n);
      final String w = n.toString();
      if (w.length() > mBase.length()) {
        return Z.ZERO; // No possible value
      }
      final Z m0 = shortCircuit(n, w, '0');
      final Z m1 = shortCircuit(m0, w, '1');
      final Z m3 = shortCircuit(m1, w, '3');
      final Z m5 = shortCircuit(m3, w, '5');
      final Z m7 = shortCircuit(m5, w, '7');
      final Z m9 = shortCircuit(m7, w, '9');
      if (m9.equals(n)) {
        // n is prime and contains no zeros, verify primes at all splits
        mSeen.clear(); // we are not allowed repeated primes
        boolean ok = true;
        for (int k = 1; k < w.length(); ++k) {
          final Z cand = new Z(w.substring(0, k)).add(new Z(w.substring(k)));
          if (!mPrime.isPrime(cand) || !mSeen.add(cand)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return n;
        }
      } else {
        n = m9;
      }
    }
  }
}

