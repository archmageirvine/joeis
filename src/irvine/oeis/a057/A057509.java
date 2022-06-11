package irvine.oeis.a057;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057509 Permutation of natural numbers: rotations of the bottom branches of the rooted plane trees encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057509 extends A014486 {

  private static Z rotateBottomBranchesLeft(final Z n) {
    return SExpression.binexp2pars(n).rotateLeft().toZ();
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(rotateBottomBranchesLeft(super.next()));
  }
}
