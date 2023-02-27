package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061580 a(1) = 1, a(n)= number obtained by replacing each digit of a(n-1) with four times its value.
 * @author Sean A. Irvine
 */
public class A061580 extends Sequence1 {

  protected StringBuilder mA = null;
  private final int mMultiplier;

  protected A061580(final int multiplier) {
    mMultiplier = multiplier;
  }

  /** Construct the sequence. */
  public A061580() {
    this(4);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new StringBuilder("1");
    } else {
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < mA.length(); ++k) {
        sb.append(mMultiplier * (mA.charAt(k) - '0'));
      }
      mA = sb;
    }
    return new Z(mA);
  }
}
