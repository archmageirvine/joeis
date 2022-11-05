package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000290 The squares: a(n) = n^2.
 * @author Sean A. Irvine
 */
public class A000290 extends Sequence0 {

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square();
  }
}
