package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276916.
 * @author Sean A. Irvine
 */
public class A276916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276916() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 5, 41, 61, 145});
  }
}
