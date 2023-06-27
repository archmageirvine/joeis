package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123720 a(n) = 2^n + 2^(n-1) - n.
 * @author Sean A. Irvine
 */
public class A123720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123720() {
    super(1, new long[] {2, -5, 4}, new long[] {2, 4, 9});
  }
}
