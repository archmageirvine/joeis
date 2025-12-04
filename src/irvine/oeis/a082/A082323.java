package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057501;

/**
 * A082323 Permutation A057501 applied six times ("^6"), permutation A082317 squared, permutation A082315 cubed.
 * @author Sean A. Irvine
 */
public class A082323 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A057501.rotateHandshakesP(A057501.rotateHandshakesP(A057501.rotateHandshakesP(A057501.rotateHandshakesP(A057501.rotateHandshakesP(A057501.rotateHandshakesP(SExpression.binexp2pars(super.next()))))))).toZ());
  }
}
