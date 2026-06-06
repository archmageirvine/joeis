package irvine.oeis.a085;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A085169 Permutation of natural numbers induced by the Catalan bijection gma085169 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085169 extends A014486 {

  // After Antti Karttunen

  private static SExpression evenLevel(final SExpression s) {
    return !s.isPair() ? s : SExpression.cons(oddLevel(s.car()), evenLevel(s.cdr()));
  }

  private static SExpression oddLevel(final SExpression s) {
    return !s.isPair() ? s : SExpression.append(evenLevel(s.car()), SExpression.cons(oddLevel(s.cdr()), new SExpression()));
  }

  private static SExpression s085169(final SExpression s) {
    return evenLevel(s);
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s085169(SExpression.binexp2pars(super.next())).toZ());
  }
}
