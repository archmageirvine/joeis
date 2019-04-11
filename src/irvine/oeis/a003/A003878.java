package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003878 <code>n^4+(9/2)*n^3+n^2-(9/2)*n+1</code>.
 * @author Sean A. Irvine
 */
public class A003878 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().add(9).multiply(mN).add(2).multiply(mN).subtract(9).multiply(mN).divide2().add(1);
  }
}
