package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

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
    return Functions.GLOBAL_CATALAN_RANK.z(s073287(SExpression.binexp2pars(super.next())).toZ());
  }
}

