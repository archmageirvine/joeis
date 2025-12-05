package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082352 Permutation of natural numbers induced by the Catalan bijection gma082352 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082352 extends A014486 {

  static SExpression s082352(final SExpression s) {
    if (!s.isPair() || !s.car().isPair()) {
      return s;
    }
    if (s.caar().isPair()) {
      SExpression.robr(s);
    } else {
      SExpression.swap(SExpression.robr(s));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082352(SExpression.binexp2pars(super.next())).toZ());
  }
}
