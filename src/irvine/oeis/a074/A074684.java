package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A074684 Permutation of natural numbers induced by Catalan Automorphism *A074684 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074684 extends A014486 {

  private static SExpression s074684(final SExpression s) {
    if (s.isPair()) {
      final SExpression t = A074680.rotateRightOrSwap(s);
      return SExpression.createTree(s074684(t.car()), s074684(t.cdr()));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s074684(SExpression.binexp2pars(super.next())).toZ());
  }
}
