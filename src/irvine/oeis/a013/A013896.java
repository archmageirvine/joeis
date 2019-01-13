package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013896.
 * @author Sean A. Irvine
 */
public class A013896 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(8000) : mA.multiply(3200000);
    return mA;
  }
}
