package irvine.oeis.a077;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a072.A072004;

/**
 * A077022 Values of k such that sum of first k primes squared is divisible by k-th prime.
 * @author Sean A. Irvine
 */
public class A077022 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077022() {
    super(1, new A072004(), ZERO);
  }
}
