package irvine.oeis.a059;

import irvine.oeis.a006.A006483;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A059670 F(n)*2^n + 1 (A006483) is prime, where F(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A059670 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A059670() {
    super(new A006483(), 0);
  }
}
