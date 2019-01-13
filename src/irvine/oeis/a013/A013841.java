package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013841.
 * @author Sean A. Irvine
 */
public class A013841 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1296) : mA.multiply(7776);
    return mA;
  }
}
