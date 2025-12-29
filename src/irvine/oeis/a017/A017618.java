package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017618 a(n) = (12*n + 8)^2.
 * @author Sean A. Irvine
 */
public class A017618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017618() {
    super(new long[] {1, -3, 3}, new long[] {64, 400, 1024});
  }
}
