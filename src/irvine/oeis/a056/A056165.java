package irvine.oeis.a056;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056165 e^[e^[e^ ... [e^0] ... ]], n high, where [] is "floor".
 * @author Sean A. Irvine
 */
public class A056165 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : CR.valueOf(mA).exp().floor();
    return mA;
  }
}
