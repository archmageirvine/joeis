package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257464 Number of factorizations of <code>m^n</code> into 3 factors, where m is a product of exactly 3 distinct primes and each factor is a product of n primes (counted with <code>multiplicity)</code>.
 * @author Sean A. Irvine
 */
public class A257464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257464() {
    super(new long[] {1, -2, -1, 3, 1, -1, -3, 1, 2}, new long[] {1, 1, 5, 10, 23, 40, 73, 114, 180});
  }
}
