package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058278.
 * @author Sean A. Irvine
 */
public class A058278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058278() {
    super(new long[] {1, 0, 1}, new long[] {1, 1, 0});
  }
}
