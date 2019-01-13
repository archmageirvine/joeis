package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212965.
 * @author Sean A. Irvine
 */
public class A212965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212965() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 12, 21, 37});
  }
}
