package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017375 a(n) = (10*n + 8)^11.
 * @author Sean A. Irvine
 */
public class A017375 extends Sequence0 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(11);
  }
}

