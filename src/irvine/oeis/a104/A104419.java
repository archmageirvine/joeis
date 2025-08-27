package irvine.oeis.a104;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A104419 Numbers n such that n, p[n], p[n]+n, p[n]-n and p[n]*n all are 0-less.
 * @author Georg Fischer
 */
public class A104419 extends AbstractSequence {

  private int mN;
  private char mDigit;

  /** Construct the sequence. */
  public A104419() {
    this(1, '0');
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit digit that may not occur
   */
  public A104419(final int offset, final char digit) {
    super(offset);
    mN = 0;
    mDigit = digit;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (String.valueOf(mN).indexOf(mDigit) < 0) {
        final Z p = Functions.PRIME.z(mN);
        if (p.toString().indexOf(mDigit) < 0
          && p.add(mN).toString().indexOf(mDigit) < 0
          && p.subtract(mN).toString().indexOf(mDigit) < 0
          && p.multiply(mN).toString().indexOf(mDigit) < 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
