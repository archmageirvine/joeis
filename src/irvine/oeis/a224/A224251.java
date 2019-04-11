package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224251 Numbers, <code>a(n)</code> where binomial(a(n), <code>5n-1) == 0 (mod 5)</code> and binomial(a(n), <code>k) != 0 (mod 5)</code> for <code>k != 5n - 1</code>.
 * @author Sean A. Irvine
 */
public class A224251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224251() {
    super(new long[] {-5, 5, 0, 0, 1}, new long[] {8, 13, 18, 23, 48});
  }
}
