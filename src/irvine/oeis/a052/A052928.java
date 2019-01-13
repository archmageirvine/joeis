package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052928.
 * @author Sean A. Irvine
 */
public class A052928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052928() {
    super(new long[] {-1, 1, 1}, new long[] {0, 0, 2});
  }
}
