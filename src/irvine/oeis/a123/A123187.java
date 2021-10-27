package irvine.oeis.a123;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A123187 Triangle of coefficients in expansion of (1+13x)^n.
 * @author Georg Fischer
 */
public class A123187 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = Z.ONE;
    } else {
      mT = mT.multiply(13);
    }
    return Binomial.binomial(mN, mM).multiply(mT);
  }
}
