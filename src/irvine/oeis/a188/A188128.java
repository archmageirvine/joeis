package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188128.
 * @author Sean A. Irvine
 */
public class A188128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188128() {
    super(new long[] {-1, -1, 3, 2}, new long[] {4, 2, 10, 23});
  }
}
