package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017042.
 * @author Sean A. Irvine
 */
public class A017042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017042() {
    super(new long[] {1, -3, 3}, new long[] {25, 144, 361});
  }
}
