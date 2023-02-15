package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061437 Numbers n such that n+1 divides prime(n)+1.
 * @author Sean A. Irvine
 */
public class A061437 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().add(1).mod(++mN + 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

