package irvine.oeis.a085;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A085167 Permutation of natural numbers induced by the Catalan bijection gma085167 acting on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A085167 extends A014486 {

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(A085159.s085159(SExpression.binexp2pars(super.next()).exch().toZ()));
  }
}
