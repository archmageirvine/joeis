package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013771.
 * @author Sean A. Irvine
 */
public class A013771 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(484) : mA.multiply(10648);
    return mA;
  }
}
