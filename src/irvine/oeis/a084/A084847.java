package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084847 a(n) = 2*3^n+2^(2n-1)*(n-2).
 * @author Sean A. Irvine
 */
public class A084847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084847() {
    super(new long[] {48, -40, 11}, new long[] {1, 4, 18});
  }
}
