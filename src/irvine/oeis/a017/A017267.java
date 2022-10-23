package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017267 a(n) = (9*n + 8)^11.
 * @author Sean A. Irvine
 */
public class A017267 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(11);
  }
}

