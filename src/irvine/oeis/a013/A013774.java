package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013774.
 * @author Sean A. Irvine
 */
public class A013774 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(24) : mA.multiply(13824);
    return mA;
  }
}
