package irvine.oeis.a102;
// manually deris/primeval at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a004.A004094;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A102385 Primes in A004094.
 * @author Georg Fischer
 */
public class A102385 extends PrependSequence {

  /** Construct the sequence. */
  public A102385() {
    super(1, new PrimeSubsequence(new A004094()).skip(3), 2, 23, 61);
  }
}
