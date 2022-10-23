package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017339 a(n) = (10*n + 5)^11.
 * @author Sean A. Irvine
 */
public class A017339 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(11);
  }
}

