package irvine.oeis.a210;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A210025 a(0)=1. Let S = string of digits of a(0),a(1),a(2),... To get a(n+1) (n&gt;=0), subtract next element of S from a(n) if that would give a positive number, otherwise add it to a(n).
 * @author Sean A. Irvine
 */
public class A210025 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A210025(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A210025() {
    super(0);
  }

  private Z mA = null;
  private final StringBuilder mDigits = new StringBuilder();
  private int mN = -1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int d = mDigits.charAt(++mN) - '0';
      final Z t = mA.subtract(d);
      if (t.signum() > 0) {
        mA = t;
      } else {
        mA = mA.add(d);
      }
    }
    mDigits.append(mA.toString());
    return mA;
  }
}
