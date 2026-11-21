package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.a329.A329054;

/**
 * A122085 Triangle read by rows: T(n,k) = number of unlabeled free bicolored trees with n nodes (n &gt;= 1) and k (1 &lt;= k &lt;= n-1, except k=0 or 1 if n=1, k=1 if n=2) nodes of one color and n-k nodes of the other color (the colors are not interchangeable).
 * @author Gregory Morse
 */
public class A122085 extends A329054 {
  private int mN = 1;
  private int mK = -1;

  /** Construct the sequence. */
  public A122085() {
    setOffset(1);
  }

  @Override
  public Z next() {
    if (++mK > (mN == 1 ? 1 : mN - 1)) {
      ++mN;
      mK = 1;
    }
    return t(mN - mK, mK);
  }
}
