package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017268 a(n) = (9*n + 8)^12.
 * @author Sean A. Irvine
 */
public class A017268 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(12);
  }
}

