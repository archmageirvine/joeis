package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017266 a(n) = (9*n + 8)^10.
 * @author Sean A. Irvine
 */
public class A017266 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(10);
  }
}

