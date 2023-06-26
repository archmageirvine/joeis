package irvine.oeis.a277;

import irvine.oeis.FiniteSequence;

/**
 * A277398 Like 5-white numbers but with blocks of 5 starting at left.
 * @author Georg Fischer
 */
public class A277398 extends FiniteSequence {

  /** Construct the sequence. */
  public A277398() {
    super(1, FINITE, 1, 10000, 73440, 95120, 218510, 221220, 222220, 242900, 245610, 289970, 344070);
  }
}
