package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A074689 Permutation of natural numbers induced by the Catalan bijection gmA074689! acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074689 extends A014486 {

  private static SExpression s074689(final SExpression s) {
    if (s.isPair()) {
      final SExpression t = A074680.rotateRightOrSwap(s);
      t.setCar(s074689(t.car()));
      return t;
    }
    return s;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s074689(SExpression.binexp2pars(super.next())).toZ());
  }
}
