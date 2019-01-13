package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098647.
 * @author Sean A. Irvine
 */
public class A098647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098647() {
    super(new long[] {-64, 24}, new long[] {1, 12});
  }
}
