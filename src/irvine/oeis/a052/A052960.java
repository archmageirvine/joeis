package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052960.
 * @author Sean A. Irvine
 */
public class A052960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052960() {
    super(new long[] {-1, -1, 2, 2}, new long[] {1, 1, 3, 7});
  }
}
