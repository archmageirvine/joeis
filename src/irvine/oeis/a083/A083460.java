package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083460 Palindromes arising in A083456.
 * @author Sean A. Irvine
 */
public class A083460 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN).add(1);
      if (Predicates.PALINDROME.is(t)) {
        return t;
      }
    }
  }
}
