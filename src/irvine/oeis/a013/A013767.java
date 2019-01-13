package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013767.
 * @author Sean A. Irvine
 */
public class A013767 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(400) : mA.multiply(8000);
    return mA;
  }
}
