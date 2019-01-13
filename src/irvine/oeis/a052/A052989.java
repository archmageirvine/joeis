package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052989.
 * @author Sean A. Irvine
 */
public class A052989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052989() {
    super(new long[] {-1, 1, 0, 1, 1}, new long[] {1, 0, 1, 1, 3});
  }
}
