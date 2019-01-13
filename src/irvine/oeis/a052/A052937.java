package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052937.
 * @author Sean A. Irvine
 */
public class A052937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052937() {
    super(new long[] {-1, -1, 3}, new long[] {2, 3, 6});
  }
}
