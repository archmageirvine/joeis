package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000720;

/**
 * A073798 pi(n) is a power of 2, where pi(n) = A000720(n) is the number of primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A073798 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073798() {
    super(1, new A000720(), Predicates.POWER_OF_TWO::is);
  }
}
