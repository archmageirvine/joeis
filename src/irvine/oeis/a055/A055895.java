package irvine.oeis.a055;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055895 Inverse Moebius transform of powers of 2.
 * @author Sean A. Irvine
 */
public class A055895 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Integers.SINGLETON.sumdiv(mN, d -> Z.ONE.shiftLeft(d));
  }
}
