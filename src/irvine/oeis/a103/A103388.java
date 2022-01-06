package irvine.oeis.a103;
// manually deris2/primeval at 2021-11-04 15:02
// DO NOT EDIT here!

import irvine.oeis.prime.PrimeSubsequence;
/**
 * A103388 Primes in A103378.
 * @author Georg Fischer
 */
public class A103388 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A103388() {
    super(new A103378());
    for (int i = 1; i <= 9; ++i) {
      super.next();
    }
  }
}
