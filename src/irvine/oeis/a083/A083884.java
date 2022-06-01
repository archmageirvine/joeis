package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083884 a(n) = (3^(2*n) + 1) / 2.
 * @author Sean A. Irvine
 */
public class A083884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083884() {
    super(new long[] {-9, 10}, new long[] {1, 5});
  }
}
