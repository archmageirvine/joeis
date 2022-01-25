package irvine.oeis.a054;

import irvine.util.Triple;

/**
 * A054206 Consider all integer triples (i,j,k), j &gt;= k &gt; 0, with binomial(i+2,3)=j^3+k^3, ordered by increasing i; sequence gives j values.
 * @author Sean A. Irvine
 */
public class A054206 extends A054205 {

  @Override
  protected long select(final Triple<Long> t) {
    return t.mid();
  }
}

