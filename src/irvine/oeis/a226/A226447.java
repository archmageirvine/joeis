package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226447.
 * @author Sean A. Irvine
 */
public class A226447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226447() {
    super(new long[] {1, -2, 1, 0}, new long[] {1, -1, 1, -2});
  }
}
