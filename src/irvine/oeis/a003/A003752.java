package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003752.
 * @author Sean A. Irvine
 */
public class A003752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003752() {
    super(new long[]{0, 2, -10, -9, 67, 16, -36, 11},
      new long[] {4, 72, 584, 4016, 24656, 140624, 761960, 3976704}
    );
  }
}
