package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016090 a(n) = 16^(5^n) mod 10^n: Automorphic numbers ending in digit 6, with repetitions.
 * @author Sean A. Irvine
 */
public class A016090 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    mF = mF.multiply(5);
    return Z.SIX.modPow(mF, mT);
  }
}
