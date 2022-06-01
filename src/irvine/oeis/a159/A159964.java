package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159964 a(n) = 2^n*(1-n).
 * @author Sean A. Irvine
 */
public class A159964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159964() {
    super(new long[] {-4, 4}, new long[] {1, 0});
  }
}
