package irvine.oeis.a322;

import irvine.oeis.FiniteSequence;

/**
 * A322511 Nonnegative numbers whose digits can be formed by typing adjacent keys on a 123-456-789 keypad without repeating a digit and without changing direction.
 * @author Georg Fischer
 */
public class A322511 extends FiniteSequence {

  /** Construct the sequence. */
  public A322511() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 14, 21, 23, 25, 32, 36, 41, 45, 47, 52, 54, 56, 58, 63, 65, 69, 74, 78, 85, 87, 89, 96, 98, 123, 147, 258, 321, 369, 456, 654, 741, 789, 852, 963, 987);
  }
}
