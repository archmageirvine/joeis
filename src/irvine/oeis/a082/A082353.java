package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082353 Permutation of natural numbers induced by the Catalan bijection gma082353 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082353 extends A014486 {

  static SExpression s082353(final SExpression s) {
    if (!s.isPair() || !s.cdr().isPair()) {
      return s;
    }
    if (s.car().isPair()) {
      SExpression.robr(s);
    } else {
      SExpression.robr(SExpression.swap(s));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082353(SExpression.binexp2pars(super.next())).toZ());
  }
}
