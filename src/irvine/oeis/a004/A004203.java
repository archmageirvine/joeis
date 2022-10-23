package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004203 Numbers n such that 54*10^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A004203 extends Sequence1 {

  private Z mA = Z.valueOf(54);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(10);
      if (mA.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
