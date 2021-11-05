package irvine.oeis.a103;
// manually deris2/primeval at 2021-11-04 15:02

import irvine.oeis.PrimeSubsequence;
/**
 * A103382 Primes in A103372.
 * @author Georg Fischer
 */
public class A103382 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A103382() {
    super(new A103372());
    for (int i = 1; i <= 3; ++i) {
      super.next();
    }
  }
}
