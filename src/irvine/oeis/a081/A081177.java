package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A081177 Values of r in the terms of A067688.
 * @author Sean A. Irvine
 */
public class A081177 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      final Z[] p = fs.toZArray();
      long r = 0;
      while (true) {
        final long rr = ++r;
        final Z sum = Integers.SINGLETON.sum(0, p.length - 1, k -> p[k].pow(rr).multiply(fs.getExponent(p[k])));
        final int c = sum.compareTo(n);
        if (c == 0) {
          return Z.valueOf(rr);
        }
        if (c > 0) {
          break;
        }
      }
    }
  }
}
