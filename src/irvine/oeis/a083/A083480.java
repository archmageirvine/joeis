package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a049.A049597;

/**
 * A083480 Compress the triangular array A049597 by suppressing zero entries and reversing the order of each row.
 * @author Sean A. Irvine
 */
public class A083480 extends A049597 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 0;
      }
      final Z c = get(mN - mM).coeff(mM);
      if (!c.isZero()) {
        return c;
      }
    }
  }
}

