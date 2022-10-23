package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017991 Powers of cube root of 6 rounded down.
 * @author Sean A. Irvine
 */
public class A017991 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(6);
    return mN.root(3);
  }
}

