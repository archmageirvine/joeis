package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153173 a(n) = L(5*n)/L(n) where L(n) = n-th Lucas number A000032(n).
 * @author Sean A. Irvine
 */
public class A153173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153173() {
    super(0, new long[] {1, -5, -15, 15, 5}, new long[] {1, 11, 41, 341, 2161});
  }
}
