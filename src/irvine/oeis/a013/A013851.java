package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013851.
 * @author Sean A. Irvine
 */
public class A013851 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(81) : mA.multiply(59049);
    return mA;
  }
}
