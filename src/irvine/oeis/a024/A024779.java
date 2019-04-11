package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024779 Every suffix is prime and contains no 0 digits in base 4 (written in base <code>4)</code>.
 * @author Georg Fischer
 */
public class A024779 extends FiniteSequence {

  /** Construct the sequence. */
  public A024779() {
    super(2, 3, 13, 23, 113, 223, 323, 1223, 2113, 3323, 21223, 32113, 33323, 233323, 321223, 333323);
  }
}
