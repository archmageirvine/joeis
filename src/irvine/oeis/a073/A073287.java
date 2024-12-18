package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A073287 Permutation of natural numbers induced by the composition of the Catalan bijections A069768 &amp; A069770.
 * @author Sean A. Irvine
 */
public class A073287 extends A014486 {

  static SExpression s073287(final SExpression s) {
    return s.exch().knack();
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s073287(SExpression.binexp2pars(super.next())).toZ());
  }
}

