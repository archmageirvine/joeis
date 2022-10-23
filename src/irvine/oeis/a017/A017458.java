package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017458 a(n) = (11*n + 5)^10.
 * @author Sean A. Irvine
 */
public class A017458 extends Sequence0 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(10);
  }
}

