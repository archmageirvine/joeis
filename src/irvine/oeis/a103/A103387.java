package irvine.oeis.a103;
// manually deris2/primeval at 2021-11-04 15:02

import irvine.oeis.PrimeSubsequence;
/**
 * A103387 Primes in A103377.
 * @author Georg Fischer
 */
public class A103387 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A103387() {
    super(new A103377());
    for (int i = 1; i <= 8; ++i) {
      super.next();
    }
  }
}
