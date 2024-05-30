package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046942 Numbers k such that k and prime(k) are both palindromes.
 * @author Sean A. Irvine
 */
public class A046942 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (Predicates.PALINDROME.is(p) && Predicates.PALINDROME.is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
