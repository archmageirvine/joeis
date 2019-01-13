package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013902.
 * @author Sean A. Irvine
 */
public class A013902 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(22) : mA.multiply(5153632);
    return mA;
  }
}
