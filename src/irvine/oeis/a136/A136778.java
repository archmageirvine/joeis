package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136778.
 * @author Sean A. Irvine
 */
public class A136778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136778() {
    super(new long[] {-3, -9, 7}, new long[] {1, 3, 15});
  }
}
