package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005891 Centered pentagonal numbers: <code>(5n^2+5n+2)/2</code>; crystal ball sequence for 3.3.3.4.4. planar net.
 * @author Sean A. Irvine
 */
public class A005891 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(5).divide2().add(1);
  }
}
