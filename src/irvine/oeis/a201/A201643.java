package irvine.oeis.a201;

import irvine.oeis.FiniteSequence;

/**
 * A201643 John Leech's example of a set of eleven distinct odd numbers the sum of whose reciprocals is 1.
 * @author Georg Fischer
 */
public class A201643 extends FiniteSequence {

  /** Construct the sequence. */
  public A201643() {
    super(3, 5, 7, 9, 15, 21, 27, 35, 63, 105, 135);
  }
}
