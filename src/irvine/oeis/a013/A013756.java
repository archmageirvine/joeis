package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013756.
 * @author Sean A. Irvine
 */
public class A013756 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(15) : mA.multiply(3375);
    return mA;
  }
}
