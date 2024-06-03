package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001481;

/**
 * A070176 Let s(n) be smallest number &gt;= n which is a sum of two squares (A001481); sequence gives s(n) - n.
 * @author Sean A. Irvine
 */
public class A070176 extends Sequence0 {

  private final Sequence mA = new A001481();
  private Z mT = mA.next();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mT.compareTo(mN) < 0) {
      mT = mA.next();
    }
    return mT.subtract(mN);
  }
}
