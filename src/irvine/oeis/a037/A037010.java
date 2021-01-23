package irvine.oeis.a037;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002385;

/**
 * A037010 Differences between adjacent palindromic primes.
 * @author Sean A. Irvine
 */
public class A037010 extends DifferenceSequence {

  /** Construct the sequence. */
  public A037010() {
    super(new A002385());
  }
}
