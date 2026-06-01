package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085086 a(1) = 1; if n is composite then a(n) = Sum_{i &lt; n, i not prime} a(i), else if n is prime then a(n) = sum_{ j &lt; n, j is a noncomposite} a(j).
 * @author Sean A. Irvine
 */
public class A085086 extends Sequence1 {

  private Z mSumNoncomposite = Z.ONE;
  private Z mSumNonprime = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (Predicates.PRIME.is(mN)) {
      final Z t = mSumNoncomposite;
      mSumNoncomposite = mSumNoncomposite.add(t);
      return t;
    } else {
      final Z t = mSumNonprime;
      mSumNonprime = mSumNonprime.add(t);
      return t;
    }
  }
}

