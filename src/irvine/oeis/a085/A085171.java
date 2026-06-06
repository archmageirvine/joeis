package irvine.oeis.a085;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A085171 Permutation of natural numbers induced by the Catalan bijection gma085171 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085171 extends A014486 {

  static SExpression appToXrt(final SExpression a, final SExpression b) {
    if (a.isEmpty()) {
      return b;
    }
    if (a.cdr().isPair()) {
      return SExpression.cons(a.car(), appToXrt(a.cdr(), b));
    } else {
      return SExpression.cons(appToXrt(a.car(), b), a.cdr());
    }
  }

  private static SExpression map085171(final SExpression s) {
    final SExpression res = new SExpression();
    for (final SExpression t : s) {
      res.add(s085171(t));
    }
    return res;
  }

  private static SExpression s085171(final SExpression s) {
    if (s.isEmpty()) {
      return s;
    }
    final SExpression b = map085171(s.cdr());
    b.add(new SExpression());
    return appToXrt(s085171(s.car()), b);
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s085171(SExpression.binexp2pars(super.next())).toZ());
  }
}
