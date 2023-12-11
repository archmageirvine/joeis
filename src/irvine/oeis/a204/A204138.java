package irvine.oeis.a204;
// manually deris2/primeval at 2021-11-04

import irvine.oeis.a001.A001945;
import irvine.oeis.prime.PrimeSubsequence;
/**
 * A204138 Primes in A001945, apart from initializing 6 terms.
 * @author Georg Fischer
 */
public class A204138 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A204138() {
    super(new A001945());
    next();
  }
}
