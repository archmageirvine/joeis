package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136252.
 * @author Sean A. Irvine
 */
public class A136252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136252() {
    super(new long[] {-2, 2, 1}, new long[] {1, 3, 5});
  }
}
