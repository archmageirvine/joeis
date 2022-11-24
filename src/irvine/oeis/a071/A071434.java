package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a002.A002186;

/**
 * A071434 Sprague-Grundy values for octal game .1377.
 * @author Georg Fischer
 */
public class A071434 extends A002186 {

  private int mN = 0;
  private Z mA;

  /** Construct the sequence. */
  public A071434() {
    mA = super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      mA = super.next();
    }
    return mA;
  }
}
