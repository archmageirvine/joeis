package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016967 a(n) = (6*n + 4)^11.
 * @author Sean A. Irvine
 */
public class A016967 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(11);
  }
}

