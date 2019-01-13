package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013865.
 * @author Sean A. Irvine
 */
public class A013865 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(20736) : mA.multiply(248832);
    return mA;
  }
}
