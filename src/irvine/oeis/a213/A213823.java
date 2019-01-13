package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213823.
 * @author Sean A. Irvine
 */
public class A213823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213823() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 41, 147, 358});
  }
}
