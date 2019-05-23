package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022958 <code>2-n</code>.
 * @author Sean A. Irvine
 */
public class A022958 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    mN = mN.subtract(1);
    return mN;
  }
}
