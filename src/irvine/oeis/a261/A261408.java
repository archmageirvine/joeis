package irvine.oeis.a261;
// manually prisuba at 2023-02-14 11:26

import irvine.oeis.a260.A260864;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A261408 Numbers k such that A260864(k) is a prime or probable prime, where A260864(k) is the number whose base-14 representation is the concatenation of the base-14 representations of (1, ..., k, k-1, ..., 1).
 * @author Georg Fischer
 */
public class A261408 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A261408() {
    super(new A260864(), 0);
  }

}
