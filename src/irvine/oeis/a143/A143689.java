package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143689.
 * @author Sean A. Irvine
 */
public class A143689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143689() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 6});
  }
}
