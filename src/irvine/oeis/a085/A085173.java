package irvine.oeis.a085;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057501;
import irvine.oeis.a074.A074683;
import irvine.oeis.a074.A074684;

/**
 * A085173 Permutation of natural numbers induced by the Catalan bijection gma085173 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085173 extends A014486 {

  /**
   * This bijection applied to an S-expression.
   * @param s S-expression
   * @return S-expression
   */
  public static SExpression s085173(final SExpression s) {
    return A074684.s074684(A057501.rotateHandshakesP(A074683.s074683(s)));
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s085173(SExpression.binexp2pars(super.next())).toZ());
  }
}
