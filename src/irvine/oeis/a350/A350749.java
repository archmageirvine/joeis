package irvine.oeis.a350;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A350749 Triangle read by rows: T(n,k) is the number of oriented graphs on n labeled nodes with k arcs, n &gt;= 0, k = 0..n*(n-1)/2.
 * @author Gregory Morse
 */
public class A350749 extends Sequence0 {
  private long mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN * (mN - 1) / 2, mM).shiftLeft(mM);
  }
}
