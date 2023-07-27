package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a014.A014566;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064772 Sum of primes dividing n^n+1 (with repetition).
 * @author Sean A. Irvine
 */
public class A064772 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064772() {
    super(1, new A014566().skip(), k -> Jaguar.factor(k).sopfr());
  }
}
