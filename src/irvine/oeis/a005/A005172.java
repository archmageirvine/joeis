package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005172 Number of labeled rooted trees of subsets of an n-set.
 * @author Sean A. Irvine
 */
public class A005172 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      final Z a = Functions.FACTORIAL.z(mN + k - 1);
      for (int j = 1; j <= k; ++j) {
        Z u = Z.ZERO;
        for (int i = 0; i <= j; ++i) {
          final Z t = Stirling.firstKind(mN - i + j - 1, j - i).shiftLeft(mN - i + j - 1).multiply(a)
            .divide(Functions.FACTORIAL.z(i)).divide(Functions.FACTORIAL.z(mN - i + j - 1));
          u = u.signedAdd((i & 1) == 0, t);
        }
        s = s.signedAdd((j & 1) == 0, u.divide(Functions.FACTORIAL.z(k - j)));
      }
    }
    return s;
  }
}
