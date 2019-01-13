package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007420.
 * @author Sean A. Irvine
 */
public class A007420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007420() {
    super(new long[] {4, -4, 2}, new long[] {0, 0, 1});
  }
}

