package irvine.oeis.a057;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057508 Self-inverse permutation of natural numbers induced by the function 'reverse' (present in programming languages like Lisp, Scheme, Prolog and Haskell) when it acts on symbolless S-expressions encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A057508 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(SExpression.binexp2pars(super.next()).reverse().toZ());
  }
}
