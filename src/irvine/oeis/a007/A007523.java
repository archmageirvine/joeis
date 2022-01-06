package irvine.oeis.a007;

import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.a092.A092845;

/**
 * A007523 Primes in A092845 (decimal expansion of Pi written backwards).
 * @author Sean A. Irvine
 */
public class A007523 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A007523() {
    super(new A092845());
  }
}
