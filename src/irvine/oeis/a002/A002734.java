package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002734 Remove squares!.
 * @author Sean A. Irvine
 */
public class A002734 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p) & 1;
        if (e == 1) {
          prod = prod.multiply(p);
        }
      }
      if (!Z.ONE.equals(prod)) {
        return prod;
      }
    }
  }
}
