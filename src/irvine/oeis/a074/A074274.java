package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074274 Gaps between even number of 1's in the Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A074274 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074274() {
    super(1, new A074273());
  }
}
