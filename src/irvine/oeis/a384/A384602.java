package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.a035.A035513;

/**
 * A384602 Numbers k such that T(k, 1) mod 3 = 1 and T(k, 2) mod 3 = 2, where T is the Wythoff array (A035513).
 * @author Sean A. Irvine
 */
public class A384602 extends A035513 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (get(++mN, 1L).mod(3) == 1 && get(mN, 2L).mod(3) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}

