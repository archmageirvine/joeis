package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174192.
 * @author Sean A. Irvine
 */
public class A174192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174192() {
    super(new long[] {-1, -1, 3}, new long[] {1, 2, 7});
  }
}
