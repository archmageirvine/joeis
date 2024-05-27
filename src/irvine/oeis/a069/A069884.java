package irvine.oeis.a069;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069884 Smallest nontrivial palindromic n-th perfect power such that a(n)^(1/n) is different for different values of n.
 * @author Sean A. Irvine
 */
public class A069884 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN);
      if (Predicates.PALINDROME.is(t) && mUsed.add(k)) {
        return t;
      }
    }
  }
}

