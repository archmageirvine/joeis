package irvine.oeis.a394;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394640 allocated for Jud McCranie.
 * @author Sean A. Irvine
 */
public class A394640 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN == 2) {
        return Z.TWO;
      }
      if (InverseEuler.inversePhi(mN - 2).isEmpty() && !InverseEuler.inversePhi(mN).isEmpty() && !InverseEuler.inversePhi(mN + 2).isEmpty() && !InverseEuler.inversePhi(mN + 4).isEmpty() && !InverseEuler.inversePhi(mN + 6).isEmpty() && !InverseEuler.inversePhi(mN + 8).isEmpty() && !InverseEuler.inversePhi(mN + 10).isEmpty() && InverseEuler.inversePhi(mN + 12).isEmpty()) {
        return Z.valueOf(mN);
      }
    }
  }
}
