package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281166.
 * @author Sean A. Irvine
 */
public class A281166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281166() {
    super(new long[] {2, -3, 3}, new long[] {1, 1, 3});
  }
}
