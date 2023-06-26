package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098160 Numbers n with property that when writing down all the natural numbers from 0 to n one uses the same number of even and odd digits.
 * @author Georg Fischer
 */
public class A098160 extends FiniteSequence {

  /** Construct the sequence. */
  public A098160() {
    super(1, FINITE, 1, 3, 5, 7, 9, 10, 28, 29, 30, 48, 49, 50, 68, 69, 70, 88, 89, 90);
  }
}
