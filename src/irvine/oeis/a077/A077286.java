package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a023.A023057;

/**
 * A077286 Primes which are not the difference between two successive perfect powers (A001597).
 * @author Sean A. Irvine
 */
public class A077286 extends FilterSequence {

  /** Construct the sequence. */
  public A077286() {
    super(1, new A023057(), PRIME);
  }
}
