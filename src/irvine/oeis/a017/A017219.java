package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017219 a(n) = (9*n + 4)^11.
 * @author Sean A. Irvine
 */
public class A017219 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

