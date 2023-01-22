package irvine.oeis.a061;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001580;

/**
 * A061119 Primes in the sequence n^2 + 2^n (A001580).
 * @author Sean A. Irvine
 */
public class A061119 extends FilterSequence {

  /** Construct the sequence. */
  public A061119() {
    super(new A001580(), PRIME);
  }
}
