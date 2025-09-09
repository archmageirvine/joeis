package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387465 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A387465 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    if (++mM >= 1L << (mN - 1)) {
      ++mN;
      mM = 0;
    }
    final long s = (1L << (mN - 1)) + mM;
    Z prod = Z.ONE;
    for (long j = 0; j < mN; ++j) {
      if ((s & (1L << j)) != 0) {
        prod = prod.multiply(Functions.PRIME.z(mN - j).pow(j + 1));
      }
    }
    return prod;
  }
}

