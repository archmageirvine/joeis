package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071929 Numbers k such that the sum of exponents of k is equal to the greatest prime factor of k; a(1)=1.
 * @author Sean A. Irvine
 */
public class A071929 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      long s = 0;
      for (final Z p : fs.toZArray()) {
        s += fs.getExponent(p);
      }
      if (s == fs.largestPrimeFactor().longValue()) {
        return Z.valueOf(mN);
      }
    }
  }
}
