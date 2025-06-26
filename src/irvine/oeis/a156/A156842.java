package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156842 a(n) = 529*n^2 - 746*n + 263.
 * @author Sean A. Irvine
 */
public class A156842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156842() {
    super(1, new long[] {1, -3, 3}, new long[] {46, 887, 2786});
  }
}
