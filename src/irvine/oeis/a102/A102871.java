package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102871.
 * @author Sean A. Irvine
 */
public class A102871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102871() {
    super(new long[] {1, -5, 5}, new long[] {1, 3, 10});
  }
}
