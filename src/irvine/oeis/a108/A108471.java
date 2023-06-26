package irvine.oeis.a108;

import irvine.oeis.FiniteSequence;

/**
 * A108471 Smallest prime with a run of n strictly increasing digits.
 * @author Georg Fischer
 */
public class A108471 extends FiniteSequence {

  /** Construct the sequence. */
  public A108471() {
    super(1, FINITE, 2, 13, 127, 1237, 12347, 123457, 1234789, 12356789, 1234567891L, 100123456789L);
  }
}
