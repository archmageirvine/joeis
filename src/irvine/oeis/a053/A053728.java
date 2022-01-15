package irvine.oeis.a053;

import irvine.oeis.a001.A001065;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A053728 For n=1,2,3,..., compute sum of aliquot divisors of n; if result is prime append this prime to sequence.
 * @author Sean A. Irvine
 */
public class A053728 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A053728() {
    super(new A001065());
  }
}
