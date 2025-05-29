package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077543 Smallest n-digit composite palindrome.
 * @author Sean A. Irvine
 */
public class A077543 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.FOUR;
    }
    Z t = new Z("1" + "0".repeat(mN - 1));
    while (t.isProbablePrime() || !Predicates.PALINDROME.is(t)) {
      t = t.add(1);
    }
    return t;
  }
}
