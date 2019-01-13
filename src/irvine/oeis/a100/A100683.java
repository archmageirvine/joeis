package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100683.
 * @author Sean A. Irvine
 */
public class A100683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100683() {
    super(new long[] {1, 1, 1}, new long[] {-1, 2, 2});
  }
}
