package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A002202 Values taken by totient function <code>phi(m) (A000010)</code>.
 * @author Sean A. Irvine
 */
public class A002202 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
      return Z.ONE;
    }
    while (true) {
      mN = mN.add(2);
      if (!Euler.inversePhi(mN).isEmpty()) {
        return mN;
      }
    }
  }
}
