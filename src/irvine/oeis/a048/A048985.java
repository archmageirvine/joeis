package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048985 Working in base 2, replace n with the concatenation of its prime divisors in increasing order (write answer in base 10).
 * @author Sean A. Irvine
 */
public class A048985 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      for (int k = 0; k < fs.getExponent(p); ++k) {
        sb.append(p.toString(2));
      }
    }
    return new Z(sb, 2);
  }
}

