package irvine.oeis.a014;

import irvine.oeis.DifferenceSequence;

/**
 * A014974 Differences between successive locations of zeros in decimal expansion of <code>Pi</code>.
 * @author Sean A. Irvine
 */
public class A014974 extends DifferenceSequence {

  /** Construct the sequence. */
  public A014974() {
    super(new A014976());
  }
}
