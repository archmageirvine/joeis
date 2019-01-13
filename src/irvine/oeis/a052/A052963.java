package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052963.
 * @author Sean A. Irvine
 */
public class A052963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052963() {
    super(new long[] {-1, 0, 3}, new long[] {1, 2, 5});
  }
}
