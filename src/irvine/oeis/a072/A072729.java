package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A072729 Denominator of rationals &gt;= 1 whose continued fractions consist only of 1's and 2's, in ascending order by the sum of the continued fraction terms and descending by lowest order continued fraction terms to highest.
 * @author Sean A. Irvine
 */
public class A072729 extends A072728 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
