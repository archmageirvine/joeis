package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067718 Numbers k such that sigma(2^k+1) == 0 (mod k).
 * @author Sean A. Irvine
 */
public class A067718 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(Z.ONE.shiftLeft(++mN).add(1)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
