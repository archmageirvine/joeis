package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017007 a(n) = (7*n + 2)^3.
 * @author Sean A. Irvine
 */
public class A017007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017007() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 729, 4096, 12167});
  }
}
