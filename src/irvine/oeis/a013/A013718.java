package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013718.
 * @author Sean A. Irvine
 */
public class A013718 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(13) : mA.multiply(169);
    return mA;
  }
}
