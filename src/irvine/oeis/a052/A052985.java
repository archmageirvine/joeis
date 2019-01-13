package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052985.
 * @author Sean A. Irvine
 */
public class A052985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052985() {
    super(new long[] {-1, 1, -1, 3}, new long[] {1, 2, 5, 14});
  }
}
