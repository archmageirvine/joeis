package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014118.
 * @author Sean A. Irvine
 */
public class A014118 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(mA.toString(2), 3);
    return mA;
  }
}
