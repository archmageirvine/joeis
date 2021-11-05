package irvine.oeis.a103;
// manually deris2/primeval at 2021-11-04 15:02

import irvine.oeis.PrimeSubsequence;
/**
 * A103385 Primes in A103375.
 * @author Georg Fischer
 */
public class A103385 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A103385() {
    super(new A103375());
    for (int i = 1; i <= 6; ++i) {
      super.next();
    }
  }
}
