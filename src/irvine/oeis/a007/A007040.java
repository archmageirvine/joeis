package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007040.
 * @author Sean A. Irvine
 */
public class A007040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007040() {
    super(new long[] {0, 1, 2, 1, 0}, new long[] {2, 2, 6, 6, 10});
  }
}

