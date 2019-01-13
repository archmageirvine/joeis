package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070397.
 * @author Sean A. Irvine
 */
public class A070397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070397() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 6, 11, 16, 21});
  }
}
