package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;

/**
 * A082335 Permutation of natural numbers induced by the Catalan bijection gma082335 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082335 extends A014486 {

  private static SExpression s082335(final SExpression s) {
    if (s.isPair()) {
      if (s.cdr().isPair()) {
        return SExpression.robl(s);
      } else {
        // It would be nice to have this directly in SExpression-land
        return SExpression.binexp2pars(A057162.reflectBinTree(s.toZ()));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082335(SExpression.binexp2pars(super.next())).toZ());
  }
}
