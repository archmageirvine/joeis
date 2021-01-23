package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017572 (12n+4)^4.
 * @author Sean A. Irvine
 */
public class A017572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017572() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {256, 65536, 614656, 2560000, 7311616});
  }
}
