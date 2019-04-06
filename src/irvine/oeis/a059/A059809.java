package irvine.oeis.a059;

import irvine.oeis.FiniteSequence;

/**
 * A059809 Numbers that do not contain exactly the same digits in two different smaller bases.
 * @author Georg Fischer
 */
public class A059809 extends FiniteSequence {

  /** Construct the sequence. */
  public A059809() {
    super(2, 3, 4, 5, 6, 8, 10, 12, 14, 18, 20, 24, 32, 48, 60, 72, 168, 720);
  }
}
