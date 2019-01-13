package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048480.
 * @author Sean A. Irvine
 */
public class A048480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048480() {
    super(new long[] {4, -8, 5}, new long[] {1, 10, 37});
  }
}
