package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069883 Smallest nontrivial palindromic n-th perfect power (a(n) &gt;1 for n&gt;1).
 * @author Sean A. Irvine
 */
public class A069883 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN);
      if (Predicates.PALINDROME.is(t)) {
        return t;
      }
    }
  }
}

