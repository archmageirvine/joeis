package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A072797 Self-inverse permutation of natural numbers induced by a Catalan bijection acting on binary trees as encoded by A014486. See comments and examples for details.
 * @author Sean A. Irvine
 */
public class A072797 extends A014486 {

  /**
   * The bijection of A072797.
   * @param s expression
   * @return expression
   */
  public static SExpression s072797(final SExpression s) {
    if (!s.isPair() || !s.car().isPair()) {
      return s;
    }
    final SExpression u = SExpression.robl(SExpression.swap(s));
    u.setCar(SExpression.swap(u.car()));
    return u;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s072797(SExpression.binexp2pars(super.next())).toZ());
  }
}
