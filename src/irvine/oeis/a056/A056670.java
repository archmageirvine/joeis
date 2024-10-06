package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A056670 Largest non-unitary prime factor of A001405(n) = binomial(n, floor(n/2)), or 1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A056670 extends A001405 {

  /** Construct the sequence. */
  public A056670() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    final FactorSequence fs = mFactor.factorize(super.next());
    final Z[] f = fs.toZArray();
    for (int k = f.length - 1; k >= 0; --k) {
      if (fs.getExponent(f[k]) > 1) {
        return f[k];
      }
    }
    return Z.ONE;
  }
}
