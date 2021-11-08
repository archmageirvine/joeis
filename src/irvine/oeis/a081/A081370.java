package irvine.oeis.a081;
// manually 2021-08-15

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081370 Binomial(n^2, n) reduced mod n^2 is 0.
 * @author Georg Fischer
 */
public class A081370 implements Sequence {

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
