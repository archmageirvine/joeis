package irvine.oeis.a059;

import irvine.oeis.a006.A006483;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A059670 Numbers k such that F(k)*2^k + 1 (A006483) is prime, where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A059670 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A059670() {
    super(new A006483(), 0);
  }
}
