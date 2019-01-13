package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062318.
 * @author Sean A. Irvine
 */
public class A062318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062318() {
    super(new long[] {-3, 3, 1}, new long[] {0, 1, 2});
  }
}
