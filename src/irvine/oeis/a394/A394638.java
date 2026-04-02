package irvine.oeis.a394;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394638 allocated for Jud McCranie.
 * @author Sean A. Irvine
 */
public class A394638 extends Sequence1 {

  private long mN = 76;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (InverseEuler.inversePhi(mN - 2).isEmpty() && !InverseEuler.inversePhi(mN).isEmpty() && !InverseEuler.inversePhi(mN + 2).isEmpty() && !InverseEuler.inversePhi(mN + 4).isEmpty() && !InverseEuler.inversePhi(mN + 6).isEmpty() && InverseEuler.inversePhi(mN + 8).isEmpty()) {
        return Z.valueOf(mN);
      }
    }
  }
}
