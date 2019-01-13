package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013785.
 * @author Sean A. Irvine
 */
public class A013785 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(216) : mA.multiply(1296);
    return mA;
  }
}
