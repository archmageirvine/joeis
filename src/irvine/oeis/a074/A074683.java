package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A074683 Permutation of natural numbers induced by the Catalan Automorphism *A074683 acting on parenthesizations as encoded and ordered by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074683 extends A014486 {

  private static SExpression s074683(final SExpression s) {
    if (s.isPair()) {
      final SExpression t = SExpression.createTree(s074683(s.car()), s074683(s.cdr()));
      return A074679.rotateLeftOrSwap(t);
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s074683(SExpression.binexp2pars(super.next())).toZ());
  }
}
