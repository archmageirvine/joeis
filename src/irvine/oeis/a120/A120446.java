package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120446 Expansion of 1/(1-x-x^4-x^6).
 * @author Sean A. Irvine
 */
public class A120446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120446() {
    super(new long[] {1, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3});
  }
}
