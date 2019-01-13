package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007387.
 * @author Sean A. Irvine
 */
public class A007387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007387() {
    super(new long[] {0, 0, 0, 1, 0, 0, 1, 0}, new long[] {0, 2, 3, 2, 5, 2, 7, 2});
  }
}

