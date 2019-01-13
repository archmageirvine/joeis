package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017511.
 * @author Sean A. Irvine
 */
public class A017511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017511() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1000, 9261, 32768, 79507});
  }
}
