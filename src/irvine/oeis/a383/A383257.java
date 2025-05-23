package irvine.oeis.a383;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A383257 Let p = prime(n), then a(n) is the non-p-smooth part of (p-1)!+1.
 * @author Sean A. Irvine
 */
public class A383257 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final FactorSequence fs = new FactorSequence(Functions.FACTORIAL.z(p.subtract(1)).add(1));
    new PrimeDivision(p.longValueExact()).factor(fs);
    Z prod = Z.ONE;
    for (final Z q : fs.toZArray()) {
      if (q.compareTo(p) > 0) {
        prod = prod.multiply(q.pow(fs.getExponent(q)));
      }
    }
    return prod;
  }
}

