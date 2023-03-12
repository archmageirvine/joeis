package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061867 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (ZUtils.digitProduct(square).isSquare()) {
        return square;
      }
    }
  }
}
