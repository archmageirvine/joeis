package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267796.
 * @author Sean A. Irvine
 */
public class A267796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267796() {
    super(new long[] {-256, 32}, new long[] {4, 128});
  }
}
