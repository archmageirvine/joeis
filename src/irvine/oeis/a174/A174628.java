package irvine.oeis.a174;

import irvine.oeis.FiniteSequence;

/**
 * A174628 "Binary dates": take the dates with the format <code>dd/mm/yy</code> that have only <code>0</code>'s and <code>1</code>'s and transform their value to base 10.
 * @author Georg Fischer
 */
public class A174628 extends FiniteSequence {

  /** Construct the sequence. */
  public A174628() {
    super(20, 36, 52, 24, 40, 56, 28, 44, 60, 21, 37, 53, 25, 41, 57, 29, 45, 61, 22, 38, 54, 26, 42, 58, 30, 46, 62, 23, 39, 55, 27, 43, 59, 31, 47, 63);
  }
}
