package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291414.
 * @author Sean A. Irvine
 */
public class A291414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291414() {
    super(new long[] {-1, -3, -3, -1, 2, 2}, new long[] {2, 6, 15, 37, 89, 212});
  }
}
