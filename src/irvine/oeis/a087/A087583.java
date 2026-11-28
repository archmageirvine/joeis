package irvine.oeis.a087;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087583 Distinct primes such that the absolute values of successive differences are distinct palindromes. a(n+1) is chosen to be &lt; a(n) if such a prime exists, minimizing a(n)-a(n+1); otherwise the minimal a(n+1) &gt; a(n) is chosen.
 * @author Sean A. Irvine
 */
public class A087583 extends Sequence0 {

  private final HashSet<Z> mSeenPrimes = new HashSet<>();
  private final HashSet<Z> mSeenPalindromes = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mSeenPrimes.add(Z.TWO);
      mA = Z.TWO;
      return mA;
    }
    final Z p = mA;
    while (true) {
      mA = Functions.PREV_PRIME.z(mA);
      if (mA.isZero()) {
        break;
      }
      final Z d = p.subtract(mA);
      if (Predicates.PALINDROME.is(d) && !mSeenPrimes.contains(mA) && mSeenPalindromes.add(d)) {
        mSeenPrimes.add(mA);
        return mA;
      }
    }
    mA = p;
    while (true) {
      mA = Functions.NEXT_PRIME.z(mA);
      final Z d = mA.subtract(p);
      if (Predicates.PALINDROME.is(d) && !mSeenPrimes.contains(mA) && mSeenPalindromes.add(d)) {
        mSeenPrimes.add(mA);
        return mA;
      }
    }
  }
}

