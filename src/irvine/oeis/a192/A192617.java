package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192617.
 * @author Sean A. Irvine
 */
public class A192617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192617() {
    super(new long[] {1, 1, -4, -1, 4, 1}, new long[] {0, 1, 0, 3, 2, 10});
  }
}
