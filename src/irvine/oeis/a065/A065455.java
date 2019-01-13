package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065455.
 * @author Sean A. Irvine
 */
public class A065455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065455() {
    super(new long[] {1, 3, 0}, new long[] {1, 2, 4});
  }
}
