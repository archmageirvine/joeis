package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034104 Fractional part of square root of a(n) starts with digit 8.
 * @author Sean A. Irvine
 */
public class A034104 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        if (CR.valueOf(mN).sqrt().frac().multiply(10).floor().longValue() == 8) {
          return mN;
        }
      }
    }
  }
}

