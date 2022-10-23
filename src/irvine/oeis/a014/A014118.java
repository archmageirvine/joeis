package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014118 Write in binary and read in ternary!.
 * @author Sean A. Irvine
 */
public class A014118 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(mA.toString(2), 3);
    return mA;
  }
}
