package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199594 Number of sequences of n coin flips that win on the last flip, if the sequence of flips ends with (0,0,1,1) or (1,1,1,1).
 * @author Sean A. Irvine
 */
public class A199594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199594() {
    super(new long[] {-1, 0, 1, 1, 1}, new long[] {0, 0, 0, 2, 3});
  }
}
