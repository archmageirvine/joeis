package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082354 Permutation of natural numbers induced by the Catalan bijection gma082354 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082354 extends A014486 {

  private static SExpression s082354(final SExpression s) {
    if (!s.isPair() || !s.cdr().isPair()) {
      return s;
    }
    if (s.cddr().isPair()) {
      SExpression.robl(s);
    } else {
      SExpression.swap(SExpression.robl(s));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082354(SExpression.binexp2pars(super.next())).toZ());
  }
}
