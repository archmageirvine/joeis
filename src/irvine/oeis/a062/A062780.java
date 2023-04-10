package irvine.oeis.a062;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a053.A053810;

/**
 * A062780 Differences between consecutive prime powers of primes (see A053810).
 * @author Sean A. Irvine
 */
public class A062780 extends DifferenceSequence {

  /** Construct the sequence. */
  public A062780() {
    super(new A053810());
  }
}
