package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395535 a(n) = (n XOR n*2+1) for odd n, (n XOR n/2) for even n.
 * @author Sean A. Irvine
 */
public class A395535 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.xor(mN.divide2()) : mN.xor(mN.multiply2().add(1));
  }
}
