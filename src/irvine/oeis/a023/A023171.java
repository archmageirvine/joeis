package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A023171.
 * @author Sean A. Irvine
 */
public class A023171 extends A000045 {

  private long mN = 0;
  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == (89 * mN - 89) % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

