package irvine.oeis.a094;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A094351 Rearrangement of integers such that a(0)!*a(1)!*...*a(n)! + 1 is prime.
 * @author Sean A. Irvine
 */
public class A094351 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Z mProd = Z.ONE;
  private boolean[] mUsed = new boolean[1000];

  private boolean isUsed(final int n) {
    if (n >= mUsed.length) {
      mUsed = Arrays.copyOf(mUsed, Math.max(2 * mUsed.length, 2 * n));
    }
    return mUsed[n];
  }

  @Override
  public Z next() {
    int k = 0;
    while (true) {
      if (!isUsed(k)) {
        final Z p = mProd.multiply(mF.factorial(k));
        if (p.add(1).isProbablePrime()) {
          mUsed[k] = true;
          mProd = p;
          return Z.valueOf(k);
        }
      }
      ++k;
    }
  }
}
