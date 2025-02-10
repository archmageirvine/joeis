package irvine.oeis.a057;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057509 Permutation of natural numbers: rotations of the bottom branches of the rooted plane trees encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057509 extends A014486 {

  /**
   * Rotate bottom branches left.
   * @param n tree
   * @return rotated tree
   */
  public static Z rotateBottomBranchesLeft(final Z n) {
    return SExpression.binexp2pars(n).rotateLeft().toZ();
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(rotateBottomBranchesLeft(super.next()));
  }
}
