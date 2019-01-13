package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052916.
 * @author Sean A. Irvine
 */
public class A052916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052916() {
    super(new long[] {-1, 2, 0, 1}, new long[] {1, 0, 0, 2});
  }
}
