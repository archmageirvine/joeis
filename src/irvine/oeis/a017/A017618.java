package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017618.
 * @author Sean A. Irvine
 */
public class A017618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017618() {
    super(new long[] {1, -3, 3}, new long[] {64, 400, 1024});
  }
}
