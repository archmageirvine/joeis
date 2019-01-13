package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080937.
 * @author Sean A. Irvine
 */
public class A080937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080937() {
    super(new long[] {1, -6, 5}, new long[] {1, 1, 2});
  }
}
