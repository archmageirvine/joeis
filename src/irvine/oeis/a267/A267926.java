package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267926.
 * @author Sean A. Irvine
 */
public class A267926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267926() {
    super(new long[] {-16, 16, 1}, new long[] {1, 7, 23});
  }
}
