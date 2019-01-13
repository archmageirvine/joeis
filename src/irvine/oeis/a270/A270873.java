package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270873.
 * @author Sean A. Irvine
 */
public class A270873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270873() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {21, 7668, 75545, 545730, 3015021, 13239896, 48243393, 151298070, 420233285, 1056651996});
  }
}
