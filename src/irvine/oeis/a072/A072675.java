package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072675.
 * @author Sean A. Irvine
 */
public class A072675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072675() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 8, 19, 22, 28, 41, 59, 61});
  }
}
