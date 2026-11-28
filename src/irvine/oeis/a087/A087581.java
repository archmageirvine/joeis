package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087581 Primes such that successive differences are increasing palindromes.
 * @author Sean A. Irvine
 */
public class A087581 extends Sequence0 {

  private Z mA = null;
  private Z mPalindrome = Z.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    final Z p = mA;
    mA = mA.add(mPalindrome);
    while (true) {
      mA = Functions.NEXT_PRIME.z(mA);
      final Z d = mA.subtract(p);
      if (Predicates.PALINDROME.is(d)) {
        mPalindrome = d;
        return mA;
      }
    }
  }
}

