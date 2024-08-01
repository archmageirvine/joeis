package irvine.oeis.a081;
// manually 2021-08-15

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081370 Numbers k such that binomial(k^2, k) reduced mod k^2 is 0.
 * @author Georg Fischer
 */
public class A081370 extends Sequence1 {

  protected Z mK;

  /** Construct the sequence. */
  public A081370() {
    mK = Z.ZERO;
  }

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(Z.ONE);
      final Z n2 = mK.square();
      if (Binomial.binomial(n2, mK).mod(n2).equals(Z.ZERO)) {
        return mK;
      }
    }
  }
}
