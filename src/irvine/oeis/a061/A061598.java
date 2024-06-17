package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061598 Distance to the largest Catalan number which is less than, but divides the n-th Catalan number; i.e., a(n) gives minimum k (&gt; 0) such that C_{n-k}|C_n.
 * @author Sean A. Irvine
 */
public class A061598 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z c = Functions.CATALAN.z(++mN);
    long k = mN;
    while (true) {
      final long n = --k;
      if (c.mod(Functions.CATALAN.z(n)).isZero()) {
        return Z.valueOf(mN - k);
      }
    }
  }
}
