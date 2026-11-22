package irvine.oeis.a372;

import irvine.math.z.Z;
import irvine.oeis.a212.A212084;

/**
 * A372254 Number A(n,k) of acyclic orientations of the complete tripartite graph K_{n,n,k}; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Gregory Morse
 */
public class A372254 extends A212084 {
  private int mN = 0;
  private int mK = -1;

  protected Z t(final int n, final int k) {
    return orientations(n, n, k);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return t(mK, mN - mK);
  }
}
