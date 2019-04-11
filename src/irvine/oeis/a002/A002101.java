package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002101 Nearest integer to <code>4 *</code> Pi <code>* n^3 / 3</code>.
 * @author Sean A. Irvine
 */
public class A002101 implements Sequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR CONST = CR.PI.shiftLeft(2).divide(CR.THREE);
  private long mN = -1;

  @Override
  public Z next() {
    return CONST.multiply(REALS.pow(CR.valueOf(++mN), 3)).add(CR.HALF).floor(32);
  }
}
