package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034105 Numbers n such that fractional part of square root of n starts with digit 9.
 * @author Sean A. Irvine
 */
public class A034105 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        if (CR.valueOf(mN).sqrt().frac().multiply(10).floor().longValue() == 9) {
          return mN;
        }
      }
    }
  }
}

