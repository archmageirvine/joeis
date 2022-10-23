package irvine.oeis.a062;
// manually 2022-06-04

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062634 Numbers k such that every divisor of k contains the digit 1.
 * @author Georg Fischer
 */
public class A062634 extends Sequence1 {

  private int mN;
  private int mDigit;
  private char mDigitChar;
  private boolean mComposite;

  /** Construct the sequence. */
  public A062634() {
    this(false, 1);
  }

  /**
   * Generic constructor with parameters
   * @param composite whether the number must be composite
   * @param digit the desired digit
   */
  public A062634(final boolean composite, final int digit) {
    mComposite = composite;
    mDigit = digit;
    mDigitChar = Character.forDigit(digit, 10);
    mN = digit == 0 ? 9 : digit - 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z[] divisors = Jaguar.factor(++mN).divisors();
      // System.out.println("mN=" + mN + ", " + divisors.length + " divisors");
      if (!mComposite || divisors.length > 2) {
        boolean busy = true;
        for (final Z d : divisors) {
          if (mDigit == 1 || !d.equals(Z.ONE)) {
            if (String.valueOf(d).indexOf(mDigitChar) < 0) {
              busy = false;
            }
          }
        }
        if (busy) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
