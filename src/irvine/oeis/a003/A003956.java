package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003956 Order of complex Clifford group of degree <code>2^n</code> arising in quantum coding theory.
 * @author Sean A. Irvine
 */
public class A003956 implements Sequence {

  private Z mA = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(2 * mN).subtract(1));
    }
    return mA.shiftLeft(mN * mN + 2 * mN + 3);
  }
}
