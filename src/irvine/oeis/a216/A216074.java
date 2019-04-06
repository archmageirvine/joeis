package irvine.oeis.a216;

import irvine.oeis.FiniteSequence;

/**
 * A216074 Number of ways in which a four-player Old Maid match lasts for exactly n games until a player has been trolled exactly three times.
 * @author Georg Fischer
 */
public class A216074 extends FiniteSequence {

  /** Construct the sequence. */
  public A216074() {
    super(16384, 36864, 55296, 61440, 51840, 30240, 10080);
  }
}
