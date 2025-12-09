package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a007.A007519;

/**
 * A390354 allocated for Zoltan Reti.
 * @author Sean A. Irvine
 */
public class A390354 extends A007519 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long pp = p.longValueExact();
      CR sum = CR.ZERO;
      final long h = (pp - 1) / 2;
      for (long k = 1; k <= h; ++k) {
        final CR tp = CR.TAU.divide(pp);
        final CR e4 = tp.multiply(Z.valueOf(k).pow(4)).cos();
        sum = sum.add(e4);
      }
      if (sum.multiply(2).divide(CR.valueOf(p).sqrt()).compareTo(CR.ONE) < 0) {
        return p;
      }
    }
  }
}
