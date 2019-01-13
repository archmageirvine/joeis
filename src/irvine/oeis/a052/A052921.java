package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052921.
 * @author Sean A. Irvine
 */
public class A052921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052921() {
    super(new long[] {1, -2, 3}, new long[] {1, 2, 4});
  }
}
