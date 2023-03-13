package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A061869 Squares whose sum of digits as well as product of digits is a square (allowing zero).
 * @author Sean A. Irvine
 */
public class A061869 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (ZUtils.digitProduct(square).isSquare() && LongUtils.isSquare(ZUtils.digitSum(square))) {
        return square;
      }
    }
  }
}
