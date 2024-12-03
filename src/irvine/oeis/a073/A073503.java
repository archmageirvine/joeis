package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073503 Numbers n such that the number of solutions to x^4 == 1 (mod n) is twice the number of solutions of x^2 == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A073503 extends Sequence1 {

  // After Charles R Greathouse IV

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      int s = 0;
      for (final Z p : fs.toZArray()) {
        if (p.mod(4) == 1) {
          ++s;
        }
      }
      final int e = Functions.VALUATION.i(mN, 2);
      if ((e < 4 && s == 1) || (e >= 4 && s == 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}

