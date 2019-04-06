package irvine.oeis.a201;

import irvine.oeis.FiniteSequence;

/**
 * A201648 The fourth of the five known sets of nine distinct odd numbers the sum of whose reciprocals is 1.
 * @author Georg Fischer
 */
public class A201648 extends FiniteSequence {

  /** Construct the sequence. */
  public A201648() {
    super(3, 5, 7, 9, 11, 15, 21, 231, 315);
  }
}
