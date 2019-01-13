package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058310.
 * @author Sean A. Irvine
 */
public class A058310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058310() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 44, 133, 319});
  }
}
