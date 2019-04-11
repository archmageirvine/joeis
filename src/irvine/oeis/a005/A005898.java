package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005898 Centered cube numbers: <code>n^3 + (n+1)^3</code>.
 * @author Sean A. Irvine
 */
public class A005898 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).add(mN.add(1).pow(3));
  }
}
