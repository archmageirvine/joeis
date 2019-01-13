package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052994.
 * @author Sean A. Irvine
 */
public class A052994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052994() {
    super(new long[] {-1, 1, 2}, new long[] {0, 2, 2});
  }
}
