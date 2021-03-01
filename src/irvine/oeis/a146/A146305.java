package irvine.oeis.a146;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.factorial.MemoryFactorial;


/**
 * A146305 Array T(n,m) = 2*(2m+3)!*(4n+2m+1)!/(m!*(m+2)!*n!*(3n+2m+3)!) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A146305 implements Sequence {

  protected final MemoryFactorial mF = new MemoryFactorial();

  /**
   * Return an entry in this sequence.
   * @param n major index
   * @param m minor index
   * @return sequence values
   */
  public Z brownD(final int n, final int m) {
    return mF.factorial(2 * m + 3).multiply2().multiply(mF.factorial(4 * n + 2 * m + 1))
      .divide(mF.factorial(m)).divide(mF.factorial(m + 2))
      .divide(mF.factorial(n)).divide(mF.factorial(3 * n + 2 * m + 3));
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return brownD(mN - mM, mM);
  }
}
