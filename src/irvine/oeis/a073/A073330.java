package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073259.
 * @author Sean A. Irvine
 */
public class A073330 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z c = Z.valueOf(++mN);
    long k = 1;
    while (true) {
      ++k;
      c = c.isEven()
        ? CR.valueOf(c).divide(CR.PI).floor()
        : CR.valueOf(c).multiply(CR.PI).floor();
      if (c.isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

