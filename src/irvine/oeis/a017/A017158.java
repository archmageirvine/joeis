package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017158 a(n) = (8*n + 7)^10.
 * @author Sean A. Irvine
 */
public class A017158 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN.pow(10);
  }
}

