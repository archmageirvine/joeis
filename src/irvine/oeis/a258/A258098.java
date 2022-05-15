package irvine.oeis.a258;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A258098 3x + 1 sequence starting at 79.
 * Copied from A008884.
 * @author Georg Fischer
 */
public class A258098 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(79) : mA.isEven() ? mA.divide2() : mA.multiply(3).add(1);
    return mA;
  }
}
