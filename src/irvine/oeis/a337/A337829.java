package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A337829 Odd integers k such that 5^((k-1)/2) + 1 == 0 (mod k*(k-1)/2).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A337829 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z t = Z.valueOf(mN * (mN - 1) / 2);
      if (Z.FIVE.modPow((mN - 1) / 2, t).equals(t.subtract(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
