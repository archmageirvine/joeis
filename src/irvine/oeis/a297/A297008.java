package irvine.oeis.a297;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A297008 Number of edge covers in the complete tripartite graph K_{n,n,n}.
 * @author Gregory Morse
 */
public class A297008 extends Sequence1 {
  private int mN = 0;

  protected static Z all(final int i, final int j, final int k) {
    return Z.ONE.shiftLeft((long) i * j + (long) j * k + (long) k * i);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN; ++j) {
        final Z choose = Binomial.binomial(mN, i).multiply(Binomial.binomial(mN, j));
        for (int k = 0; k <= mN; ++k) {
          sum = sum.signedAdd(((3 * mN - i - j - k) & 1) == 0, choose.multiply(Binomial.binomial(mN, k)).multiply(all(i, j, k)));
        }
      }
    }
    return sum;
  }
}
