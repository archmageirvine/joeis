package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015943 <code>(2^(2n)+n) mod (2n)</code>.
 * @author Sean A. Irvine
 */
public class A015943 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.multiply2();
    return Z.TWO.modPow(n2, n2).add(mN).mod(n2);
  }
}
