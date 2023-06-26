package irvine.oeis.a201;

import irvine.oeis.FiniteSequence;

/**
 * A201646 The second of the five known sets of nine distinct odd numbers the sum of whose reciprocals is 1.
 * @author Georg Fischer
 */
public class A201646 extends FiniteSequence {

  /** Construct the sequence. */
  public A201646() {
    super(1, FINITE, 3, 5, 7, 9, 11, 15, 21, 135, 10395);
  }
}
