package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A072797 Self-inverse permutation of natural numbers induced by a Catalan bijection acting on binary trees as encoded by A014486. See comments and examples for details.
 * @author Sean A. Irvine
 */
public class A072797 extends A014486 {

  @Override
  public Z next() {
    final Z t = super.next();
    final SExpression s = SExpression.binexp2pars(t);
    if (!s.isPair() || !s.car().isPair()) {
      return A057120.catalanGlobalRank(t);
    }
    final SExpression u = SExpression.robl(SExpression.swap(s));
    u.setCar(SExpression.swap(u.car()));
    return A057120.catalanGlobalRank(u.toZ());
  }
}
