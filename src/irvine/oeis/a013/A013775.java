package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013775.
 * @author Sean A. Irvine
 */
public class A013775 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(576) : mA.multiply(13824);
    return mA;
  }
}
