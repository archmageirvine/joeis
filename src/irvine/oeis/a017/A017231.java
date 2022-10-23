package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017231 a(n) = (9*n + 5)^11.
 * @author Sean A. Irvine
 */
public class A017231 extends Sequence0 {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

