package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037547.
 * @author Sean A. Irvine
 */
public class A037547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037547() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 8, 50, 301});
  }
}
