package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017195 a(n) = (9*n + 2)^11.
 * @author Sean A. Irvine
 */
public class A017195 extends Sequence0 {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

