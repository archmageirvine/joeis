package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053026 Maximal power of 2 arising when A000005 is applied repeatedly to n!.
 * @author Sean A. Irvine
 */
public class A053026 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected int mN = 0;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    if (mN <= 1) {
      return Z.ONE;
    }
    int exponent = 0;
    FactorSequence fs = mFactorSequence;
    Z s;
    do {
      s = fs.sigma0();
      fs = Jaguar.factor(s);
      if (fs.omega() == 1) {
        final int e = fs.getExponent(Z.TWO);
        if (e > exponent) {
          exponent = e;
        }
      }
    } while (Z.TWO.compareTo(s) < 0);
    return Z.ONE.shiftLeft(exponent);
  }
}
