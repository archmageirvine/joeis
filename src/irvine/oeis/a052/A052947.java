package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052947.
 * @author Sean A. Irvine
 */
public class A052947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052947() {
    super(new long[] {2, 1, 0}, new long[] {1, 0, 1});
  }
}
