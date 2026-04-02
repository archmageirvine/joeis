package irvine.oeis.a333;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333022 Starts of runs of 5 consecutive even numbers that are all totient numbers (A002202).
 * @author Sean A. Irvine
 */
public class A333022 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!InverseEuler.inversePhi(mN).isEmpty() && !InverseEuler.inversePhi(mN + 2).isEmpty() && !InverseEuler.inversePhi(mN + 4).isEmpty() && !InverseEuler.inversePhi(mN + 6).isEmpty() && !InverseEuler.inversePhi(mN + 8).isEmpty()) {
        return Z.valueOf(mN);
      }
    }
  }
}
