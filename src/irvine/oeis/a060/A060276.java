package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A060276 a(1) = 2; a(n) = smallest prime &gt; a(n-1) such that the sum of any three nondecreasing terms, chosen from a(1), ..., a(n-1) and a(n), is unique.
 * @author Sean A. Irvine
 */
public class A060276 extends MemorySequence {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mSums = new TreeSet<>();

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      mSums.add(Z.SIX);
      return Z.TWO;
    }
    Z n = a(size() - 1);
    while (true) {
      n = mPrime.nextPrime(n);
      boolean ok = true;
      outer:
      for (final Z a : this) {
        final Z an = a.add(n);
        if (mSums.contains(an.add(n))) {
          ok = false;
          break;
        }
        for (final Z b : this) {
          if (mSums.contains(an.add(b))) {
            ok = false;
            break outer;
          }
          if (b.equals(a)) {
            break;
          }
        }
      }
      if (ok) {
        mSums.add(n.multiply(3));
        for (final Z a : this) {
          final Z an = a.add(n);
          mSums.add(an.add(n)); // a + 2n
          for (final Z b : this) {
            mSums.add(an.add(b));
            if (b.equals(a)) {
              break;
            }
          }
        }
        return n;
      }
    }
  }
}

