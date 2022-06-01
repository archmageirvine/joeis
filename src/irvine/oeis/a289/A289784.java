package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289784 p-INVERT of the (4^n), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289784() {
    super(new long[] {-19, 9}, new long[] {1, 6});
  }
}
