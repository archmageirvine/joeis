package irvine.oeis.a202;

import irvine.oeis.FiniteSequence;

/**
 * A202279 Numbers k such that the sum of digits^3 of k equals Sum_{d|k, 1&lt;d&lt;k} d.
 * @author Georg Fischer
 */
public class A202279 extends FiniteSequence {

  /** Construct the sequence. */
  public A202279() {
    super(1, FINITE, 142, 160, 1375, 6127, 12643, 51703, 86833, 103039, 104647, 112093, 137317, 218269, 261883, 266923, 449881, 505891, 617569, 907873);
  }
}
