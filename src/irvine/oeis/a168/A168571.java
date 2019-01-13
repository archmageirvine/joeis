package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168571.
 * @author Sean A. Irvine
 */
public class A168571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168571() {
    super(new long[] {-5, 6}, new long[] {0, 25});
  }
}
