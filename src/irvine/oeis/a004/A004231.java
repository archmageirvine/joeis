package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004231 Ackermann's sequence: <code>n^^n := n^n^n^...^n</code> (with <code>n n's)</code>.
 * @author Sean A. Irvine
 */
public class A004231 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z z = Z.valueOf(mN);
    int n = mN;
    for (int k = 2; k < mN; ++k) {
      n = z.pow(n).intValueExact();
    }
    return z.pow(n);
  }
}
