package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289783 p-INVERT of the (3^n), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289783() {
    super(new long[] {-11, 7}, new long[] {1, 5});
  }
}
