package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097522 Triangle read by rows giving the 246 multinomials described by A005651(5) related to Young tableau and Kostka numbers.
 * @author Georg Fischer
 */
public class A097522 extends FiniteSequence {

  /** Construct the sequence. */
  public A097522() {
    super(1, 16, 1, 25, 12, 1, 36, 15, 8, 1, 25, 18, 10, 8, 1, 16, 10, 6, 5, 4, 1, 1, 4, 5, 6, 5, 4, 1);
  }
}
