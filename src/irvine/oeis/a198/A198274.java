package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198274 a(n) = 13*2^n-1.
 * @author Sean A. Irvine
 */
public class A198274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198274() {
    super(new long[] {-2, 3}, new long[] {12, 25});
  }
}
