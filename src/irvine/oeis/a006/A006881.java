package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006881 Squarefree semiprimes: Numbers that are the product of two distinct primes.
 * @author Sean A. Irvine
 */
public class A006881 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z[] f = fs.toZArray();
      if (f.length == 2 && fs.getExponent(f[0]) == 1 && fs.getExponent(f[1]) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
