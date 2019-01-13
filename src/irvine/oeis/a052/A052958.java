package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052958.
 * @author Sean A. Irvine
 */
public class A052958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052958() {
    super(new long[] {-2, 2, 0, 3}, new long[] {1, 2, 6, 20});
  }
}
