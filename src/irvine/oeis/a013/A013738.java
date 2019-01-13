package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013738.
 * @author Sean A. Irvine
 */
public class A013738 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(216);
    return mA;
  }
}
