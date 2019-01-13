package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006679.
 * @author Sean A. Irvine
 */
public class A006679 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int j = 0; j <= mN; ++j) {
      Z s = Z.ZERO;
      for (int k = 1; k <= j; ++k) {
        final Z zk = Z.valueOf(k);
        Z t = Z.ZERO;
        for (int i = 0; i <= j; ++i) {
          t = t.add(Stirling.secondKind(i, k).multiply(zk.pow(j - i)).multiply(Binomial.binomial(j, i)));
        }
        s = s.add(t.multiply(mF.factorial(2 * k - 2)).divide(mF.factorial(k - 1)).shiftLeft(1 - k));
      }
      sum = sum.signedAdd(((mN - j) & 1) == 0, s.multiply(Binomial.binomial(mN, j)));
    }
    return sum;
  }
}
