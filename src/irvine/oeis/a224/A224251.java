package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224251 Numbers, a(n) where binomial(a(n), 5n-1) == 0 (mod 5) and binomial(a(n), k) != 0 (mod 5) for k != 5n - 1.
 * @author Sean A. Irvine
 */
public class A224251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224251() {
    super(1, new long[] {-5, 5, 0, 0, 1}, new long[] {8, 13, 18, 23, 48});
  }
}
