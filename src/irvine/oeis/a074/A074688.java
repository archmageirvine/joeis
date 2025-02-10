package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A074688 Permutation of natural numbers induced by the Catalan bijection gmA074688! acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074688 extends A014486 {

  private static SExpression s074688(final SExpression s) {
    if (s.isPair()) {
      s.setCdr(s074688(s.cdr()));
      final SExpression t = A074680.rotateRightOrSwap(s);
      t.setCar(s074688(t.car()));
      return t;
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s074688(SExpression.binexp2pars(super.next())).toZ());
  }
}
