package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083436 Smallest palindrome which is 1 more than the product of n consecutive numbers.
 * @author Sean A. Irvine
 */
public class A083436 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int r = 1; r <= mN; ++r) {
      prod = prod.multiply(r);
    }
    long k = 0;
    while (true) {
      final Z t = prod.add(1);
      if (Predicates.PALINDROME.is(t)) {
        return t;
      }
      prod = prod.divide(++k).multiply(k + mN);
    }
  }
}
