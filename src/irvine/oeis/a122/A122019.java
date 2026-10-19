package irvine.oeis.a122;

import irvine.oeis.Combiner;
import irvine.oeis.a002.A002110;
import irvine.oeis.a112.A112141;

/**
 * A122019 Product of the first n semiprimes, divided by product of the first n primes, rounded down.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A122019 extends Combiner {

  /** Construct the sequence. */
  public A122019() {
    super(1, new A112141().skip(), new A002110().skip(), DIVIDE);
  }
}
