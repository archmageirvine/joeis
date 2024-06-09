package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070305 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int cnt = InverseEuler.inversePhi(Functions.PHI.z(++mN)).size();
      if (cnt == Functions.SIGMA0.i(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
