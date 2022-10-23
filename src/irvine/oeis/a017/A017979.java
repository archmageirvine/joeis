package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017979 Powers of cube root of 2 rounded down.
 * @author Sean A. Irvine
 */
public class A017979 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return mN.root(3);
  }
}

