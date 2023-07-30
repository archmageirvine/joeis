package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048593 Converse numbers: composite Fibonacci numbers Fib(k) that are congruent to Legendre symbol (k/5) mod k.
 * @author Georg Fischer
 */
public class A048593 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = t.add(mB);
      // System.err.println("mN=" + mN + ", mB=" + mB + ", legend=" + LongUtils.jacobi(mN, 5) + ", diff=" + mB.subtract(LongUtils.jacobi(mN, 5) % mN));
      if (mB.subtract(LongUtils.jacobi(mN, 5)).mod(Z.valueOf(mN)).isZero() && !mB.isProbablePrime()) {
        return mB;
      }
    }
  }
}

