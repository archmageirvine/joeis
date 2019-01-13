package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007909.
 * @author Sean A. Irvine
 */
public class A007909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007909() {
    super(new long[] {2, -1, 2}, new long[] {1, 1, 1});
  }
}

