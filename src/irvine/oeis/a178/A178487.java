package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A178487 a(n) = floor(n^(1/5)): integer part of fifth root of n.
 * @author Sean A. Irvine
 */
public class A178487 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.root(5);
  }
}
