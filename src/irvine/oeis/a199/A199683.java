package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199683.
 * @author Sean A. Irvine
 */
public class A199683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199683() {
    super(new long[] {-10, 11}, new long[] {4, 31});
  }
}
