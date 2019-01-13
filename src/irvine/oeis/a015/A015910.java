package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015910.
 * @author Sean A. Irvine
 */
public class A015910 implements Sequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.TWO.modPow(mN, mN);
  }
}
