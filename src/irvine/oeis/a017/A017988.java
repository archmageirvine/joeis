package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017988 Powers of cube root of 5 rounded down.
 * @author Sean A. Irvine
 */
public class A017988 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(5);
    return mN.root(3);
  }
}

