package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013773.
 * @author Sean A. Irvine
 */
public class A013773 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(529) : mA.multiply(12167);
    return mA;
  }
}
