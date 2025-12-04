package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082345 Permutation of natural numbers induced by the Catalan bijection gma082345 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082345 extends A014486 {

  private static SExpression s082345(SExpression s) {
    if (s.isPair()) {
      s = s.knick();
      s.setCdr(s082345(s.cdr()));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082345(SExpression.binexp2pars(super.next())).toZ());
  }
}
