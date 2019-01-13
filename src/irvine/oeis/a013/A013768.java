package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013768.
 * @author Sean A. Irvine
 */
public class A013768 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(21) : mA.multiply(9261);
    return mA;
  }
}
