package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052922.
 * @author Sean A. Irvine
 */
public class A052922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052922() {
    super(new long[] {1, 2, 0, 0}, new long[] {1, 0, 0, 2});
  }
}
