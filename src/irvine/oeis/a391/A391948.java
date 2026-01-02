package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391948 allocated for Gavin A. Forrester.
 * @author Sean A. Irvine
 */
public class A391948 extends A000040 {

  private Z f(final Z n) {
    return Z.TEN.pow(CR.valueOf(n).log10().floor().add(1)).subtract(1).multiply(10).divide(9).subtract(n);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z f = f(p);
      if (f.isProbablePrime() && f(f).equals(p)) {
        return p;
      }
    }
  }
}
