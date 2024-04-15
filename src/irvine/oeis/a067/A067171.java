package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067171 Numbers k such that sigma(k+1)+sigma(k) = sigma(2k+1).
 * @author Sean A. Irvine
 */
public class A067171 extends Sequence1 {

  private Z mS = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = mS;
      mS = Functions.SIGMA.z(++mN + 1);
      if (s.add(mS).equals(Functions.SIGMA.z(2 * mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
