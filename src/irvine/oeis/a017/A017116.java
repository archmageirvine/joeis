package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017116 a(n) = (8*n + 4)^4.
 * @author Sean A. Irvine
 */
public class A017116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017116() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {256, 20736, 160000, 614656, 1679616});
  }
}
