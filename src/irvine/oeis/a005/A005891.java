package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005891 Centered pentagonal numbers: (5n^2+5n+2)/2; crystal ball sequence for 3.3.3.4.4. planar net.
 * @author Sean A. Irvine
 */
public class A005891 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(5).divide2().add(1);
  }
}
