package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052528.
 * @author Sean A. Irvine
 */
public class A052528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052528() {
    super(new long[] {-2, 2, 2}, new long[] {1, 1, 4});
  }
}
