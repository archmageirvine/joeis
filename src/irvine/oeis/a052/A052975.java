package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052975.
 * @author Sean A. Irvine
 */
public class A052975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052975() {
    super(new long[] {1, -6, 5}, new long[] {1, 2, 6});
  }
}
