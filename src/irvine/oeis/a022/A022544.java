package irvine.oeis.a022;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022544 Numbers that are not the sum of 2 squares.
 * @author Sean A. Irvine
 */
public class A022544 implements Sequence {

  // After Charles R Greathouse IV

  private long mN = 2;

  private boolean is(final long n) {
    if ((n & 3) == 3) {
      return true;
    }
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z p : fs.toZArray()) {
      if (p.mod(4) == 3 && (fs.getExponent(p) & 1) == 1) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
