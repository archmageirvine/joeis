package irvine.oeis.a103;
// manually deris2/primeval at 2021-11-04 15:02

import irvine.oeis.prime.PrimeSubsequence;
/**
 * A103389 Primes in A103379 (= 11-delayed Fibonacci b(n) = b(n-11)+b(n-12) or = 1 for n&lt;12).
 * @author Georg Fischer
 */
public class A103389 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A103389() {
    super(new A103379());
    for (int i = 1; i <= 10; ++i) {
      super.next();
    }
  }
}
