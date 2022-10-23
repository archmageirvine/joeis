package irvine.oeis.a056;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056072 For n&gt;0, floor(e^e^ ... ^e), with n e's.
 * @author Sean A. Irvine
 */
public class A056072 extends Sequence0 {

  private CR mA = null;

  @Override
  public Z next() {
    mA = mA == null ? CR.ONE : mA.exp();
    return mA.floor();
  }
}
