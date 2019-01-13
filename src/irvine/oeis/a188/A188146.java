package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188146.
 * @author Sean A. Irvine
 */
public class A188146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188146() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 3, 1, 5, 7, 2});
  }
}
