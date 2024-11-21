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

  /**
   * The bijection of A072796.
   * @param s expression
   * @return expression
   */
  public static SExpression s072796(final SExpression s) {
    if (!s.isPair() || !s.cdr().isPair()) {
      return s;
    }
    final SExpression u = SExpression.robr(SExpression.swap(s));
    u.setCdr(SExpression.swap(u.cdr()));
    return u;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s072796(SExpression.binexp2pars(super.next())).toZ());
  }
}
