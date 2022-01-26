package irvine.oeis.a054;

import irvine.util.Triple;

/**
 * A054235 Consider all integer triples (i,j,k), j,k&gt;0, with i^3=j^3+binomial(k+2,3), ordered by increasing i; sequence gives j values.
 * @author Sean A. Irvine
 */
public class A054235 extends A054234 {

  @Override
  protected long select(final Triple<Long> t) {
    return t.mid();
  }
}

