package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016979 a(n) = (6*n + 5)^11.
 * @author Sean A. Irvine
 */
public class A016979 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(11);
  }
}

