package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A025477 Exponent of n-th nontrivial prime power (A025475).
 * @author Sean A. Irvine
 */
public class A025477 extends A025475 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    final FactorSequence fs = mFactor.factorize(super.next());
    final Z[] p = fs.toZArray();
    return p.length == 0 ? Z.ZERO : Z.valueOf(fs.getExponent(p[0]));
  }
}

