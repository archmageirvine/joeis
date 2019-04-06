package irvine.oeis.a200;

import irvine.oeis.FiniteSequence;

/**
 * A200863 List of numbers n without 1&apos;s in their decimal expansion such that n is equal to the total number of 1&apos;s in the decimal expansion of all positive numbers &lt; n.
 * @author Georg Fischer
 */
public class A200863 extends FiniteSequence {

  /** Construct the sequence. */
  public A200863() {
    super(200000, 2600000, 35000000, 35200000, 500000000L, 502600000L, 535000000L, 535200000L);
  }
}
