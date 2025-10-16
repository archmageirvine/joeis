package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198689 a(n) = 8*7^n-1.
 * @author Sean A. Irvine
 */
public class A198689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198689() {
    super(new long[] {-7, 8}, new long[] {7, 55});
  }
}
