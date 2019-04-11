package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041738 Numerators of continued fraction convergents to <code>sqrt(389)</code>.
 * @author Sean A. Irvine
 */
public class A041738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041738() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 2564, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {19, 20, 59, 79, 138, 217, 355, 927, 1282, 49643, 50925, 151493, 202418, 353911, 556329, 910240, 2376809, 3287049});
  }
}
