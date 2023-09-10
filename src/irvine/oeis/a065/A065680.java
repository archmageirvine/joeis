package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065658.
 * @author Sean A. Irvine
 */
public class A065680 extends A000040 {

  private final char mDigit;
  private long mCount = 0;

  protected A065680(final char digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A065680() {
    this('1');
  }

  @Override
  public Z next() {
    if (super.next().toString().charAt(0) == mDigit) {
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
