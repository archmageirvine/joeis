package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072797;

/**
 * A082340 Permutation of natural numbers induced by the Catalan bijection gma082340 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082340 extends A014486 {

  private static SExpression s082340(SExpression s) {
    if (s.isPair()) {
      s.setCdr(s082340(s.cdr()));
      s = A072797.s072797(s);
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082340(SExpression.binexp2pars(super.next())).toZ());
  }
}
