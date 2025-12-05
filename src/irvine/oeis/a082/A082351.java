package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082351 Permutation of natural numbers induced by the Catalan bijection gma082351 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082351 extends A014486 {

  static SExpression s082351(final SExpression s) {
    if (!s.isPair() || !s.car().isPair()) {
      return s;
    }
    if (s.cdr().isPair()) {
      SExpression.robl(s);
    } else {
      SExpression.robl(SExpression.swap(s));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082351(SExpression.binexp2pars(super.next())).toZ());
  }
}
