package irvine.oeis.a382;

import irvine.oeis.FiniteSequence;

/**
 * A382220 Numbers k such that every primitive root mod k is prime.
 * @author Sean A. Irvine
 */
public class A382220 extends FiniteSequence {

  /** Construct the sequence. */
  public A382220() {
    super(1, FINITE, 3, 4, 5, 6, 7, 9, 10, 14, 18, 22, 54);
  }
}
