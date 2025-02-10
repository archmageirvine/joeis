package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A074690 Permutation of natural numbers induced by the Catalan bijection gmA074690! acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074690 extends A014486 {

  private static SExpression s074690(final SExpression s) {
    if (s.isPair()) {
      s.setCar(s074690(s.car()));
      return A074679.rotateLeftOrSwap(s);
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s074690(SExpression.binexp2pars(super.next())).toZ());
  }
}
