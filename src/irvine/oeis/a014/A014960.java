package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014960 Numbers n such that n divides <code>s(n)</code>, where <code>s(1)=1, s(k)=s(k-1)+k*24^(k-1)</code> (A014942).
 * @author Sean A. Irvine
 */
public class A014960 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mT = mT.multiply(24);
        mA = mA.add(mT.multiply(mN));
      }
      if (mA.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
