package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257847 a(n) = floor(n/7) * (n mod 7).
 * @author Sean A. Irvine
 */
public class A257847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257847() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6});
  }
}
