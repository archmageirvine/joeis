package irvine.oeis.a046;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046759 Economical numbers: write n as a product of primes raised to powers, let D(n) = number of digits in product, l(n) = number of digits in n; sequence gives n such that D(n) &lt; l(n).
 * @author Sean A. Irvine
 */
public class A046759 extends Sequence1 {

  private long mN = 124;

  @Override
  public Z next() {
    while (!Predicates.ECONOMICAL.is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
