package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193397.
 * @author Sean A. Irvine
 */
public class A193397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193397() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {109, 271, 553, 955, 1541, 2279});
  }
}
