package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A074685 Permutation of natural numbers induced by the Catalan bijection gmA074685! acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074685 extends A014486 {

  private static SExpression s074685(final SExpression s) {
    if (s.isPair()) {
      final SExpression t = A074679.rotateLeftOrSwap(s);
      t.setCdr(s074685(t.cdr()));
      return t;
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s074685(SExpression.binexp2pars(super.next())).toZ());
  }
}
