package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082356 Permutation of natural numbers induced by Catalan Automorphism *A082356 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082356 extends A014486 {

  static SExpression s082356(final SExpression s) {
    if (s.isPair()) {
      A082352.s082352(s);
      s.setCar(s082356(s.car()));
      s.setCdr(s082356(s.cdr()));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082356(SExpression.binexp2pars(super.next())).toZ());
  }
}
