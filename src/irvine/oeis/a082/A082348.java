package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082348 Permutation of natural numbers induced by the Catalan bijection gma082348 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082348 extends A014486 {

  private static SExpression s082348(SExpression s) {
    if (s.isPair()) {
      s.setCdr(s082348(s.cdr()));
      s = s.knick();
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082348(SExpression.binexp2pars(super.next())).toZ());
  }
}
