package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175604 a(n) = 8*(10^n-7).
 * @author Sean A. Irvine
 */
public class A175604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175604() {
    super(1, new long[] {-10, 11}, new long[] {24, 744});
  }
}
