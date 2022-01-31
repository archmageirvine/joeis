package irvine.oeis.a054;

import irvine.util.Triple;

/**
 * A054222 Consider all integer triples (i,j,k), j,k&gt;0, with binomial(i+2, 3) = binomial(j+2, 3) + k^3, ordered by increasing i; sequence gives j values.
 * @author Sean A. Irvine
 */
public class A054222 extends A054221 {

  @Override
  protected long select(final Triple<Long> t) {
    return t.mid();
  }
}

