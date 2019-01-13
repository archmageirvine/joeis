package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052543.
 * @author Sean A. Irvine
 */
public class A052543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052543() {
    super(new long[] {-2, 2, 3}, new long[] {1, 2, 8});
  }
}
