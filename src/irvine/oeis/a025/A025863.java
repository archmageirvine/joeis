package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025863 Expansion of 1/((1-x^4)(1-x^5)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A025863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025863() {
    super(new long[] {1, 0, 0, 0, -1, -1, 0, 0, 0, 1, 0, -1, 0, 0, 0, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 2});
  }
}
