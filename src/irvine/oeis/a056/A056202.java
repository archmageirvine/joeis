package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A056202 Central binomial coefficient A001405(n) divided by its characteristic cube divisor A056201(n).
 * @author Sean A. Irvine
 */
public class A056202 extends A001405 {

  /** Construct the sequence. */
  public A056202() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    final FactorSequence fs = mFactor.factorize(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e > 1 && (e & 1) == 1) {
        prod = prod.multiply(p.pow(3));
      }
    }
    return n.divide(prod);
  }
}
