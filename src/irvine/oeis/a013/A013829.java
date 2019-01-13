package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013829.
 * @author Sean A. Irvine
 */
public class A013829 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(81) : mA.multiply(243);
    return mA;
  }
}
