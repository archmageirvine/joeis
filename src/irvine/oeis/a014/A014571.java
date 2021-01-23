package irvine.oeis.a014;

import irvine.oeis.BinaryToDecimalExpansionSequence;
import irvine.oeis.a010.A010060;

/**
 * A014571 Consider the Morse-Thue sequence (A010060) as defining a binary constant and convert it to decimal.
 * @author Sean A. Irvine
 */
public class A014571 extends BinaryToDecimalExpansionSequence {

  /** Construct the sequence. */
  public A014571() {
    super(new A010060());
  }
}
