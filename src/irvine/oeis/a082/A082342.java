package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072797;

/**
 * A082342 Permutation of natural numbers induced by the Catalan bijection gma082342 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082342 extends A014486 {

  private static SExpression s082342(SExpression s) {
    if (s.isPair()) {
      s.setCdr(s082342(s.cdr()));
      s = A072797.s072797(s);
      s.setCar(s082342(s.car()));
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082342(SExpression.binexp2pars(super.next())).toZ());
  }
}
