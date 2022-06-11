package irvine.oeis.a057;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057511 Permutation of natural numbers: rotations of all branches of the rooted plane trees encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057511 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(SExpression.binexp2pars(super.next()).deepRotateLeft().toZ());
  }
}
