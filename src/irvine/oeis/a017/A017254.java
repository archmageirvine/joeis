package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017254 a(n) = (9*n + 7)^10.
 * @author Sean A. Irvine
 */
public class A017254 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(10);
  }
}

