package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054416 Numbers k such that 9090...9091 (with k-1 copies of 90 and one copy of 91) is prime.
 * @author Sean A. Irvine
 */
public class A054416 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(100).add(90);
      if (mA.multiply(100).add(91).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
