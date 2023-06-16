package irvine.oeis.a014;

import irvine.oeis.DifferenceSequence;

/**
 * A014974 Differences between successive locations of zeros in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A014974 extends DifferenceSequence {

  /** Construct the sequence. */
  public A014974() {
    super(1, new A014976());
  }
}
