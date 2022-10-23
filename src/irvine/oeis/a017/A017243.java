package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017243 a(n) = (9*n + 6)^11.
 * @author Sean A. Irvine
 */
public class A017243 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

