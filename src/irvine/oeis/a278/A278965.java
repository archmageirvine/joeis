package irvine.oeis.a278;

import irvine.oeis.FiniteSequence;

/**
 * A278965 Numbers k such that k! = 2^a * 3^b * c, where a and b are 0 or powers of 2 and c is relatively prime to 6.
 * @author Georg Fischer
 */
public class A278965 extends FiniteSequence {

  /** Construct the sequence. */
  public A278965() {
    super(1, 2, 3, 6, 7, 10, 11, 18, 19);
  }
}
