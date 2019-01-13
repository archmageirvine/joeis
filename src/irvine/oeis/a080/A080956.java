package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080956.
 * @author Sean A. Irvine
 */
public class A080956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080956() {
    super(new long[] {1, -3, 3}, new long[] {1, 1, 0});
  }
}
