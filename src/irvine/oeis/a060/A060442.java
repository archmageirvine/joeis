package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A060442 Triangle T(n,k), n &gt;= 0, in which n-th row (for n &gt;= 3) lists prime factors of Fibonacci(n) (see A000045), without repetition.
 * @author Sean A. Irvine
 */
public class A060442 extends A000045 {

  private Z[] mFactors = {};
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mFactors.length) {
      final Z f = super.next();
      if (f.isZero()) {
        return Z.ZERO;
      }
      mFactors = Jaguar.factor(f).toZArray();
      mN = 0;
    }
    return mFactors.length == 0 ? Z.ONE : mFactors[mN];
  }
}
