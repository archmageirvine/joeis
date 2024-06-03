package irvine.oeis.a070;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a069.A069040;

/**
 * A070193 Numbers n such that gcd(3n,8^n+1) = 3 but n does not divide the numerator of B(2n) (the Bernoulli numbers).
 * @author Sean A. Irvine
 */
public class A070193 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A070193() {
    super(1, new A070191(), new A069040());
  }
}
