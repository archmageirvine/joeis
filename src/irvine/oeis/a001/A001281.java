package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001281 Image of n under the map n-&gt;n/2 if n even, n-&gt;3n-1 if n odd.
 * @author Sean A. Irvine
 */
public class A001281 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.divide2() : mN.multiply(3).subtract(1);
  }
}
