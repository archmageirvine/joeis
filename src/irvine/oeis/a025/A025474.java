package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A025474 Exponent of n-th prime power (A000961).
 * @author Sean A. Irvine
 */
public class A025474 extends A000961 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    final FactorSequence fs = mFactor.factorize(super.next());
    final Z[] p = fs.toZArray();
    return p.length == 0 ? Z.ZERO : Z.valueOf(fs.getExponent(p[0]));
  }
}

