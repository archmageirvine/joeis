package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052980.
 * @author Sean A. Irvine
 */
public class A052980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052980() {
    super(new long[] {1, 0, 2}, new long[] {1, 1, 2});
  }
}
