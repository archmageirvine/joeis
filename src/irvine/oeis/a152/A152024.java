package irvine.oeis.a152;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000166;

/**
 * A152024 Largest prime factor in the subfactorial of n.
 * @author Georg Fischer
 */
public class A152024 extends A000166 {

  /** Construct the sequence. */
  public A152024() {
    super(3);
  }

  {
    for (int i = 0; i < 3; ++i) {
      super.next();
    }
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).largestPrimeFactor();
  }
}
