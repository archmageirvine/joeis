package irvine.oeis.a086;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002473;

/**
 * A086247 Differences of successive 7-smooth numbers.
 * @author Georg Fischer
 */
public class A086247 extends DifferenceSequence {

  /** Construct the sequence. */
  public A086247() {
    super(1, new A002473());
  }

}
