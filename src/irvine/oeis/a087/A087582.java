package irvine.oeis.a087;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087582 Primes such that successive differences are distinct palindromes.
 * @author Sean A. Irvine
 */
public class A087582 extends Sequence0 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    final Z p = mA;
    while (true) {
      mA = Functions.NEXT_PRIME.z(mA);
      final Z d = mA.subtract(p);
      if (Predicates.PALINDROME.is(d) && mSeen.add(d)) {
        return mA;
      }
    }
  }
}

