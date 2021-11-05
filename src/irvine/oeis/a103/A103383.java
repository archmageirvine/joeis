package irvine.oeis.a103;
// manually deris2/primeval at 2021-11-04 15:02

import irvine.oeis.PrimeSubsequence;
/**
 * A103383 Primes in A103373.
 * @author Georg Fischer
 */
public class A103383 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A103383() {
    super(new A103373());
    for (int i = 1; i <= 4; ++i) {
      super.next();
    }
  }
}
