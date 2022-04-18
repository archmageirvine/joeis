package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056194 Characteristic cube divisor of n!: a(n) = A056191(n!).
 * @author Sean A. Irvine
 */
public class A056194 implements Sequence {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected long mN = 0;

  @Override
  public Z next() {
    mFactorSequence.add(++mN);
    mFactor.factor(mFactorSequence);
    Z prod = Z.ONE;
    for (final Z p : mFactorSequence.toZArray()) {
      final int e = mFactorSequence.getExponent(p);
      if (e > 1 && (e & 1) == 1) {
        prod = prod.multiply(p.pow(3));
      }
    }
    return prod;
  }
}
