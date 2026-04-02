package irvine.oeis.a333;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333019 Numbers k such that both k and k + 2 are totient numbers (A002202).
 * @author Sean A. Irvine
 */
public class A333019 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!InverseEuler.inversePhi(mN).isEmpty() && !InverseEuler.inversePhi(mN + 2).isEmpty()) {
        return Z.valueOf(mN);
      }
    }
  }
}
