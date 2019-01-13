package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013727.
 * @author Sean A. Irvine
 */
public class A013727 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(22) : mA.multiply(484);
    return mA;
  }
}
