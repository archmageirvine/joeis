package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002818 Nearest integer to exp <code>n^2</code>.
 * @author Sean A. Irvine
 */
public class A002818 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return CR.valueOf(mN.square()).exp().add(CR.HALF).floor(32);
  }
}
