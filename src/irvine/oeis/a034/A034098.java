package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034098 Decimal part of square root of <code>a(n)</code> starts with digit 2.
 * @author Sean A. Irvine
 */
public class A034098 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        if (CR.valueOf(mN).sqrt().frac().multiply(10).floor().longValue() == 2) {
          return mN;
        }
      }
    }
  }
}

