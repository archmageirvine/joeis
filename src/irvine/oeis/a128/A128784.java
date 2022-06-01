package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128784 n^2*5^n.
 * @author Sean A. Irvine
 */
public class A128784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128784() {
    super(new long[] {125, -75, 15}, new long[] {0, 5, 100});
  }
}
