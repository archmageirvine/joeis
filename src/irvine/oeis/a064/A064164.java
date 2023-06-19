package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064164 EHS numbers: k such that there is a prime p satisfying k! + 1 == 0 (mod p) and p !== 1 (mod k).
 * @author Sean A. Irvine
 */
public class A064164 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      for (final Z p : Jaguar.factor(mF.add(1)).toZArray()) {
        if (p.mod(mN) != 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

