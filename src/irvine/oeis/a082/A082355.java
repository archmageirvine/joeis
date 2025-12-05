package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082355 Permutation of natural numbers induced by Catalan Automorphism *A082355 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082355 extends A014486 {

  static SExpression s082355(final SExpression s) {
    if (s.isPair()) {
      s.setCar(s082355(s.car()));
      s.setCdr(s082355(s.cdr()));
      return A082351.s082351(s);
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082355(SExpression.binexp2pars(super.next())).toZ());
  }
}
