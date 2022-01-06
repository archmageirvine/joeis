package irvine.oeis.a103;
// manually deris2/primeval at 2021-11-04 15:02

import irvine.oeis.prime.PrimeSubsequence;
/**
 * A103384 Primes in A103374.
 * @author Georg Fischer
 */
public class A103384 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A103384() {
    super(new A103374());
    for (int i = 1; i <= 5; ++i) {
      super.next();
    }
  }
}
