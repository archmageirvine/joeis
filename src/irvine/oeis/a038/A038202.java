package irvine.oeis.a038;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038202 Least k such that n! + k^2 is a square.
 * @author Sean A. Irvine
 */
public class A038202 extends AbstractSequence {

  /** Construct the sequence. */
  public A038202() {
    super(4);
  }

  // After T. D. Noe

  private final PrimeDivision mFactor = new PrimeDivision();
  private int mN = 3;
  private Z mF = Z.SIX; // tracks n!/4

  @Override
  public Z next() {
    if (++mN > 4) {
      mF = mF.multiply(mN);
    }
    final Z s = mF.sqrt();
    final FactorSequence fs = mFactor.factorize(mF);
    Z e = null;
    for (final Z d : fs.divisorsSorted()) {
      if (d.compareTo(s) > 0) {
        break;
      }
      e = d;
    }
    return mF.divide(e).subtract(e);
  }
}
