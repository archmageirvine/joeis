package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A060441 Triangle T(n,k), n &gt;= 0, in which n-th row (for n &gt;= 3) lists prime factors of Fibonacci(n) (see A000045), with repetition.
 * @author Sean A. Irvine
 */
public class A060441 extends A000045 {

  private final List<Z> mFactors = new ArrayList<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mFactors.size()) {
      mFactors.clear();
      final Z f = super.next();
      if (f.isZero()) {
        return Z.ZERO;
      }
      final FactorSequence fs = Jaguar.factor(f);
      for (final Z p : fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(p); ++k) {
          mFactors.add(p);
        }
      }
      mN = 0;
    }
    return mFactors.isEmpty() ? Z.ONE : mFactors.get(mN);
  }
}
