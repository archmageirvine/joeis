package irvine.oeis.a285;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a278.A278114;

/**
 * A285269 Number of (odd) primes between 2*n^2 and 2*(n+1)^2.
 * @author Georg Fischer
 */
public class A285269 extends PrependSequence {

  /** Construct the sequence. */
  public A285269() {
    super(0, new DifferenceSequence(0, new A278114()), 0);
  }
}
