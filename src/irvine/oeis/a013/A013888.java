package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013888.
 * @author Sean A. Irvine
 */
public class A013888 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(5832) : mA.multiply(1889568);
    return mA;
  }
}
