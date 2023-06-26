package irvine.oeis.a220;

import irvine.oeis.FiniteSequence;

/**
 * A220017 Relative probability for a four-player Old Maid match to last for exactly n games until a player has been trolled exactly three times.
 * @author Georg Fischer
 */
public class A220017 extends FiniteSequence {

  /** Construct the sequence. */
  public A220017() {
    super(3, FINITE, 512, 1152, 1728, 1920, 1620, 945, 315);
  }
}
