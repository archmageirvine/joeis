package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014953 Numbers n such that n divides s(n), where s(1)=1, s(k)=s(k-1)+k*13^(k-1).
 * @author Sean A. Irvine
 */
public class A014953 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mT = mT.multiply(13);
        mA = mA.add(mT.multiply(mN));
      }
      if (mA.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
