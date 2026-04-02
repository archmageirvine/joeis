package irvine.oeis.a394;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394636 allocated for Jud McCranie.
 * @author Sean A. Irvine
 */
public class A394636 extends Sequence1 {

  private long mN = 62;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (InverseEuler.inversePhi(mN - 2).isEmpty() && InverseEuler.inversePhi(mN + 4).isEmpty() && !InverseEuler.inversePhi(mN).isEmpty() && !InverseEuler.inversePhi(mN + 2).isEmpty()) {
        return Z.valueOf(mN);
      }
    }
  }
}
