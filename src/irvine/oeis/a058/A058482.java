package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058482.
 * @author Sean A. Irvine
 */
public class A058482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058482() {
    super(new long[] {21, -31, 11}, new long[] {1, 25, 265});
  }
}
