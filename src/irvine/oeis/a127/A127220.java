package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127220 a(n) = 3^n*tetranacci(n) or (2^n)*A001648(n).
 * @author Sean A. Irvine
 */
public class A127220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127220() {
    super(new long[] {81, 27, 9, 3}, new long[] {3, 27, 189, 1215});
  }
}
