package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A053059 Squares whose product of digits is also a nonzero square.
 * @author Sean A. Irvine
 */
public class A053059 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      final Z d = ZUtils.digitProduct(square);
      if (d.signum() > 0 && d.isSquare()) {
        return square;
      }
    }
  }
}
