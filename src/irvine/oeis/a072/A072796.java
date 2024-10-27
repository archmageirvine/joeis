package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A072796 Self-inverse permutation of natural numbers induced by the Catalan bijection swapping the two leftmost subtrees in the general tree context of the parenthesizations encoded by A014486. See illustrations in the comments.
 * @author Sean A. Irvine
 */
public class A072796 extends A014486 {

  @Override
  public Z next() {
    final Z t = super.next();
    final SExpression s = SExpression.binexp2pars(t);
    if (!s.isPair() || !s.cdr().isPair()) {
      return A057120.catalanGlobalRank(t);
    }
    final SExpression u = SExpression.robr(SExpression.swap(s));
    u.setCdr(SExpression.swap(u.cdr()));
    return A057120.catalanGlobalRank(u.toZ());
  }
}
