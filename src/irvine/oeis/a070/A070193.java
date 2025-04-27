package irvine.oeis.a070;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a069.A069040;

/**
 * A070193 Numbers k such that gcd(3k,8^k+1) = 3 but k does not divide the numerator of B(2k) (the Bernoulli numbers).
 * @author Sean A. Irvine
 */
public class A070193 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A070193() {
    super(1, new A070191(), new A069040());
  }
}
