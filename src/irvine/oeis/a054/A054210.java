package irvine.oeis.a054;

import irvine.util.Triple;

/**
 * A054210 Consider all integer triples (i,j,k), j &gt;= k&gt;0, with i^3=binomial(j+2,3)+binomial(k+2,3), ordered by increasing i; sequence gives k values.
 * @author Sean A. Irvine
 */
public class A054210 extends A054208 {

  @Override
  protected long select(final Triple<Long> t) {
    return t.right();
  }
}

