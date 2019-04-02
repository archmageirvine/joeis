package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013766 20^(3n+1).
 * @author Sean A. Irvine
 */
public class A013766 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(20) : mA.multiply(8000);
    return mA;
  }
}
