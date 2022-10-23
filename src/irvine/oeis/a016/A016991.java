package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016991 a(n) = (7*n)^11.
 * @author Sean A. Irvine
 */
public class A016991 extends Sequence0 {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(11);
  }
}

