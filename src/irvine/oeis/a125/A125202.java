package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125202.
 * @author Sean A. Irvine
 */
public class A125202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125202() {
    super(new long[] {1, -3, 3}, new long[] {-1, 5, 19});
  }
}
