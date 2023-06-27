package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280113 Triangular numbers (A000217) that are also centered 10-gonal numbers (A062786).
 * @author Sean A. Irvine
 */
public class A280113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280113() {
    super(1, new long[] {1, -1443, 1443}, new long[] {1, 1711, 2467531});
  }
}
