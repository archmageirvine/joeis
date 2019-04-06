package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126648 A 3 X 3 magic square with magic sum 123 and entries congruent to 1 (mod 10): equals 10*A033812 - 9.
 * @author Georg Fischer
 */
public class A126648 extends FiniteSequence {

  /** Construct the sequence. */
  public A126648() {
    super(71, 1, 51, 21, 41, 61, 31, 81, 11);
  }
}
