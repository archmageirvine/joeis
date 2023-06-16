package irvine.oeis.a063;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a011.A011757;

/**
 * A063076 Differences of A011757 ("Primes with square indices").
 * @author Sean A. Irvine
 */
public class A063076 extends DifferenceSequence {

  /** Construct the sequence. */
  public A063076() {
    super(1, new A011757());
  }
}
