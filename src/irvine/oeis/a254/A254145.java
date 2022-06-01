package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254145 a(n) = 1*7^n + 2*6^n + 3*5^n + 4*4^n + 5*3^n + 6*2^n + 7*1^n.
 * @author Sean A. Irvine
 */
public class A254145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254145() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {28, 84, 336, 1596, 8400, 47244, 278256});
  }
}
