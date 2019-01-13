package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013710.
 * @author Sean A. Irvine
 */
public class A013710 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.multiply(25);
    return mA;
  }
}
