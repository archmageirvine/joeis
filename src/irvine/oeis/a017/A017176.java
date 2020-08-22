package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017176 (9n+1)^4.
 * @author Sean A. Irvine
 */
public class A017176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017176() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10000, 130321, 614656, 1874161});
  }
}
