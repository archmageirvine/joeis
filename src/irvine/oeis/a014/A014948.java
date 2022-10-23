package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014948 Numbers k such that k divides s(k), where s(1)=1, s(j)=  s(j-1) + j*7^(j-1).
 * @author Sean A. Irvine
 */
public class A014948 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mT = mT.multiply(7);
        mA = mA.add(mT.multiply(mN));
      }
      if (mA.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
