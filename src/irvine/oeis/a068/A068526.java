package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A068526 Numbers n such that prime(n+1)-prime(n) = tau(n) = A000005(n).
 * @author Sean A. Irvine
 */
public class A068526 extends A001223 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

