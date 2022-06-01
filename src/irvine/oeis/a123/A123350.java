package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123350 a(n) = (n^4 + 2n^3 + 5n^2 + 4)/4.
 * @author Sean A. Irvine
 */
public class A123350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123350() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 14, 46, 117});
  }
}
