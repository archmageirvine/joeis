package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007455.
 * @author Sean A. Irvine
 */
public class A007455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007455() {
    super(new long[] {2, 0, 3, 0}, new long[] {1, 1, 3, 5});
  }
}

