package irvine.oeis.a285;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a278.A278114;

/**
 * A285786 Number of primes p with 2(n-1)^2 < p <= 2n^2.
 * @author Georg Fischer
 */
public class A285786 extends PrependSequence {

  /** Construct the sequence. */
  public A285786() {
    super(1, new DifferenceSequence(0, new A278114()), 1);
  }
}
