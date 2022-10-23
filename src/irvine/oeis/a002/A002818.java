package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002818 Nearest integer to exp n^2.
 * @author Sean A. Irvine
 */
public class A002818 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return CR.valueOf(mN.square()).exp().round();
  }
}
