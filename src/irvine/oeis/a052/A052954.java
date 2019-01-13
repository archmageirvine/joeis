package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052954.
 * @author Sean A. Irvine
 */
public class A052954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052954() {
    super(new long[] {-1, 0, 1, 1}, new long[] {2, 1, 2, 2});
  }
}
