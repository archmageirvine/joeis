package irvine.oeis.a105;

import irvine.math.z.Z;
import irvine.oeis.PositionSequence;
import irvine.oeis.a000.A000045;

/**
 * A105501 Numbers n such that 1 is the leading digit of the n-th Fibonacci number in decimal representation.
 * @author Georg Fischer
 */
public class A105501 extends PositionSequence {

  private char mDigit;

  /** Construct the sequence. */
  public A105501() {
    this(1);
  }

  /**
   * Generice constructor with parameter
   * @param digit the leading digit
   */
  public A105501(final int digit) {
    super(1, new A000045(), 1);
    mSeq.next();
    mDigit = String.valueOf(digit).charAt(0);
  }

  @Override
  protected boolean isOk(final Z term) {
    return term.toString().charAt(0) == mDigit;
  } // isOk
}
