package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A074682 Permutation of natural numbers induced by the Catalan bijection gmA074682! acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074682 extends A014486 {

  private static SExpression s074682(final SExpression s) {
    if (s.isPair()) {
      final SExpression t = SExpression.createTree(s074682(s.car()), s074682(s.cdr()));
      return A074680.rotateRightOrSwap(t);
    }
    return s;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s074682(SExpression.binexp2pars(super.next())).toZ());
  }
}
