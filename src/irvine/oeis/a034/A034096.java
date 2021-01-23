package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034096 Fractional part of square root of n starts with digit 0 (squares excluded).
 * @author Sean A. Irvine
 */
public class A034096 implements Sequence {

  private Z mN = Z.valueOf(25);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare() && CR.valueOf(mN).sqrt().frac().multiply(10).floor().longValue() == 0) {
        return mN;
      }
    }
  }
}

