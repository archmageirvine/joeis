package irvine.oeis.a238;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A238949 Degree of divisor lattice D(n).
 * @author Georg Fischer
 */
public class A238949 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    int count = 0;
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      final int ep = fs.getExponent(p);
      ++count;
      if (ep > 1) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
