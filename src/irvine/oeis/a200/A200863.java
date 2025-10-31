package irvine.oeis.a200;

import irvine.oeis.FiniteSequence;

/**
 * A200863 List of numbers k without 1's in their decimal expansion such that k is equal to the total number of 1's in the decimal expansion of all positive numbers &lt; k.
 * @author Georg Fischer
 */
public class A200863 extends FiniteSequence {

  /** Construct the sequence. */
  public A200863() {
    super(1, FINITE, 200000, 2600000, 35000000, 35200000, 500000000L, 502600000L, 535000000L, 535200000L);
  }
}
