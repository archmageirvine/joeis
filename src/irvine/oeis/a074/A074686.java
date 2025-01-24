package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A074686 Permutation of natural numbers induced by the Catalan bijection gmA074686! acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A074686 extends A014486 {

  private static SExpression s074686(final SExpression s) {
    if (s.isPair()) {
      s.setCdr(s074686(s.cdr()));
      return A074680.rotateRightOrSwap(s);
    }
    return s;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s074686(SExpression.binexp2pars(super.next())).toZ());
  }
}
