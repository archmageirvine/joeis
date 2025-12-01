package irvine.oeis.a390;

import irvine.oeis.MultiplicativeSequence;

/**
 * A390554 a(n) is the sum of the bi-unitary divisors of n^2.
 * @author Sean A. Irvine
 */
public class A390554 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A390554() {
    super(1, (p, e) -> p.pow(2L * e + 1).subtract(1).divide(p.subtract(1)).subtract(p.pow(e)));
  }
}
