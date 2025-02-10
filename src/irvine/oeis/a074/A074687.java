package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A074687 Permutation of natural numbers induced by the Catalan bijection gmA074687! acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074687 extends A014486 {

  private static SExpression s074687(final SExpression s) {
    if (s.isPair()) {
      s.setCar(s074687(s.car()));
      final SExpression t = A074679.rotateLeftOrSwap(s);
      t.setCdr(s074687(t.cdr()));
      return t;
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s074687(SExpression.binexp2pars(super.next())).toZ());
  }
}
