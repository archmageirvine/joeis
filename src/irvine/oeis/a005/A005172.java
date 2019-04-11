package irvine.oeis.a005;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005172 Number of labeled rooted trees of subsets of <code>an</code> n-set.
 * @author Sean A. Irvine
 */
public class A005172 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      final Z a = mF.factorial(mN + k - 1);
      for (int j = 1; j <= k; ++j) {
        Z u = Z.ZERO;
        for (int i = 0; i <= j; ++i) {
          final Z t = Stirling.firstKind(mN - i + j - 1, j - i).shiftLeft(mN - i + j - 1).multiply(a)
            .divide(mF.factorial(i)).divide(mF.factorial(mN - i + j - 1));
          u = u.signedAdd((i & 1) == 0, t);
        }
        s = s.signedAdd((j & 1) == 0, u.divide(mF.factorial(k - j)));
      }
    }
    return s;
  }
}
