package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072796;

/**
 * A073269 Permutation of natural numbers induced by Catalan Automorphism *A073269 acting on the binary trees/parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A073269 extends A014486 {

  /**
   * Bijection of A073269.
   * @param s expression
   * @return expression
   */
  public static SExpression s073269(final SExpression s) {
    return A072796.s072796(s).exch();
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s073269(SExpression.binexp2pars(super.next())).toZ());
  }
}
