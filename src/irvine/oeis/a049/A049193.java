package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049193 Start with 1. Convert to base 3, describe it in base 3, convert to base 10.
 * @author Sean A. Irvine
 */
public class A049193 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : A049192.describe(mA.toString(3), 3);
    return mA;
  }
}

