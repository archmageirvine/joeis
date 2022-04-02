package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A109643 a(1) = 1, a(n) = square of the concatenation of all previous terms.
 * @author Georg Fischer
 */
public class A109643 implements Sequence {

  private Z mA = Z.ONE;
  private final StringBuilder mSb = new StringBuilder();

  @Override
  public Z next() {
    final Z result = mA;
    mSb.append(mA);
    mA = new Z(mSb.toString()).square();
    return result;
  }
}
