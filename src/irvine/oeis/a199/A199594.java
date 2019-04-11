package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199594 Number of sequences of n coin flips that win on the last flip, if the sequence of flips ends with <code>(0,0,1,1)</code> or <code>(1,1,1,1)</code>.
 * @author Sean A. Irvine
 */
public class A199594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199594() {
    super(new long[] {-1, 0, 1, 1, 1}, new long[] {0, 0, 0, 2, 3});
  }
}
