package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a002.A002186;

/**
 * A071451 Sprague-Grundy values for octal game .113377.
 * @author Georg Fischer
 */
public class A071451 extends A002186 {

  private int mN = 0;
  private Z mA;

  /** Construct the sequence. */
  public A071451() {
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN % 3 == 1) {
      mA = super.next();
    }
    return mA;
  }
}
