package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072797;

/**
 * A082341 Permutation of natural numbers induced by the Catalan bijection gma082341 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082341 extends A014486 {

  private static SExpression s082341(SExpression s) {
    if (s.isPair()) {
      s.setCar(s082341(s.car()));
      s = A072797.s072797(s);
      s.setCdr(s082341(s.cdr()));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082341(SExpression.binexp2pars(super.next())).toZ());
  }
}
