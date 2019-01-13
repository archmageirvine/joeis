package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213390.
 * @author Sean A. Irvine
 */
public class A213390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213390() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 7, 25, 55, 109, 181});
  }
}
