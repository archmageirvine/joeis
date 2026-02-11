package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A392625 Parallelized coupon collector's problem: With n fair n-sided dice, a(n) = denominator(E(n)) where E(n) is the expected number of turns for n coordinating mice to have every face present.
 * @author Sean A. Irvine
 */
public class A392625 extends A392624 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
