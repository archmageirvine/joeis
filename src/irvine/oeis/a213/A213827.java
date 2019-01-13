package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213827.
 * @author Sean A. Irvine
 */
public class A213827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213827() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 21, 90, 260, 600});
  }
}
