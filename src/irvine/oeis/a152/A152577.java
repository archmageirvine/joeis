package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152577.
 * @author Sean A. Irvine
 */
public class A152577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152577() {
    super(new long[] {-100, 101}, new long[] {11, 1001});
  }
}
