package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014257 Product of digits of <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A014257 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return ZUtils.digitProduct(mA);
  }
}
