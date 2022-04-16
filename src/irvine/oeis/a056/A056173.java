package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A056173 Number of unitary prime divisors of central binomial coefficient C(n, floor(n/2)) (A001405).
 * @author Sean A. Irvine
 */
public class A056173 extends A001405 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    final FactorSequence fs = mFactor.factorize(super.next());
    long cnt = 0;
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
