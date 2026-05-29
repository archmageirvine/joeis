package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085081 Group the natural numbers such that the product of the terms of the n-th group has a divisor with the same prime signature as that of the product of the terms of the (n-1)-th group. (1), (2), (3), (4), (5,6,7,8), (9,10,11,12,13,14),... Sequence contains the product of the terms of the groups.
 * @author Sean A. Irvine
 */
public class A085081 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z sig = FactorUtils.leastPrimeSignature(mA);
    final FactorSequence fs = new FactorSequence();
    while (true) {
      fs.add(mN);
      Jaguar.factor(fs);
      for (final Z d : fs.divisors()) {
        if (FactorUtils.leastPrimeSignature(d).equals(sig)) {
          mA = fs.product();
          return mA;
        }
      }
      ++mN;
    }
  }
}

