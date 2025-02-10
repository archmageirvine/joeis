package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A074681 Permutation of natural numbers induced by the Catalan bijection gmA074681! acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074681 extends A014486 {

  private static SExpression s074681(final SExpression s) {
    if (s.isPair()) {
      final SExpression t = A074679.rotateLeftOrSwap(s);
      return SExpression.createTree(s074681(t.car()), s074681(t.cdr()));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s074681(SExpression.binexp2pars(super.next())).toZ());
  }
}
