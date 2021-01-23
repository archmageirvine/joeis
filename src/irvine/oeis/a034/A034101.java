package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034101 Numbers whose fractional part of square root starts with digit 5.
 * @author Sean A. Irvine
 */
public class A034101 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        if (CR.valueOf(mN).sqrt().frac().multiply(10).floor().longValue() == 5) {
          return mN;
        }
      }
    }
  }
}

