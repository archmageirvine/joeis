package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082349 Permutation of natural numbers induced by the Catalan bijection gma082349 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082349 extends A014486 {

  private static SExpression s082349(SExpression s) {
    if (s.isPair()) {
      if (s.cdr().isPair()) {
        SExpression.robl(s);
      } else {
        s = s.knick();
      }
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082349(SExpression.binexp2pars(super.next())).toZ());
  }
}
