package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007373 Numbers k such that sigma(k+2) = sigma(k).
 * @author Sean A. Irvine
 */
public class A007373 extends Sequence1 {

  private long mN = 32;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.SIGMA1.z(mN).equals(Functions.SIGMA1.z(mN + 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
