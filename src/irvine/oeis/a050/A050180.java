package irvine.oeis.a050;

import irvine.oeis.PrimePositionSubsequence;
import irvine.oeis.a004.A004397;

/**
 * A050180 Prime(m) + Fibonacci(m) is prime.
 * @author Sean A. Irvine
 */
public class A050180 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A050180() {
    super(new A004397(), 1);
  }
}
