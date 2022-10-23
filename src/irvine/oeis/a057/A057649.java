package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057649 Nearest integer to ratio of volume of n-dimensional cube of side 2 to volume of n-dimensional ball of radius 1.
 * @author Sean A. Irvine
 */
public class A057649 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Q q = new Q(++mN, 2);
    return CR.valueOf(q.add(1)).gamma().divide(CR.PI.pow(q)).multiply(Z.ONE.shiftLeft(mN)).round();
  }
}
