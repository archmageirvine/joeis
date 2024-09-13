package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067695 Smallest prime factor with minimum exponent in canonical prime factorization of n, a(1)=1.
 * @author Sean A. Irvine
 */
public class A067695 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final int min = fs.minExponent();
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) == min) {
        return p;
      }
    }
    throw new RuntimeException(); // can't happen
  }
}
