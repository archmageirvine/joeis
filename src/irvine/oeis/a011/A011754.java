package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011754 Number of ones in the binary expansion of 3^n.
 * @author Sean A. Irvine
 */
public class A011754 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return Z.valueOf(mA.bitCount());
  }
}
