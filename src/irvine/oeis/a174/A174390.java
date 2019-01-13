package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174390.
 * @author Sean A. Irvine
 */
public class A174390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174390() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 4, -1, 6});
  }
}
