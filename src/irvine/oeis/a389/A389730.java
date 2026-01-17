package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A389730 Nonsquare integers &gt;= 2 for which the cube of its largest prime factor equals the sum of the cubes of its other prime factors, with multiplicity.
 * @author Sean A. Irvine
 */
public class A389730 extends A000037 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      final FactorSequence fs = Jaguar.factor(k);
      Z sum = Z.ZERO;
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.pow(3).multiply(fs.getExponent(p)));
      }
      if (sum.equals(Functions.GPF.z(k).pow(3).multiply2())) {
        return k;
      }
    }
  }
}
