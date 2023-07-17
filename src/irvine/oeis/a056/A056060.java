package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A056060 The powerfree part of the central binomial coefficients.
 * @author Sean A. Irvine
 */
public class A056060 extends A001405 {

  /** Construct the sequence. */
  public A056060() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    final FactorSequence fs = mFactor.factorize(super.next());
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) == 1) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
