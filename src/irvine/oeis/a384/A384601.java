package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.a035.A035513;

/**
 * A384601 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384601 extends A035513 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (get(++mN, 1L).mod(3) == 1 && get(mN, 2L).mod(3) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

