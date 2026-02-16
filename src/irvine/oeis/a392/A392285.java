package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392285 allocated for Ridouane Oudra.
 * @author Sean A. Irvine
 */
public class A392285 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.OMEGA.z(++mN).multiply(Z.NEG_ONE.pow(Functions.BIG_OMEGA.z(mN).add(1)));
  }
}
