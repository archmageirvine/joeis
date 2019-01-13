package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008647.
 * @author Sean A. Irvine
 */
public class A008647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008647() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 1});
  }
}

