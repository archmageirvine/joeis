package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017486.
 * @author Sean A. Irvine
 */
public class A017486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017486() {
    super(new long[] {1, -3, 3}, new long[] {64, 361, 900});
  }
}
