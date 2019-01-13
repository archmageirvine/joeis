package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291395.
 * @author Sean A. Irvine
 */
public class A291395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291395() {
    super(new long[] {-6, -12, -1, 5}, new long[] {5, 24, 103, 425});
  }
}
