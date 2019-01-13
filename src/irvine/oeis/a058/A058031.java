package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058031.
 * @author Sean A. Irvine
 */
public class A058031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058031() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 9, 49, 169});
  }
}
