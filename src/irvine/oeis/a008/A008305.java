package irvine.oeis.a008;

import irvine.math.z.Integers;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008305 Triangle read by rows: a(n,k) = number of permutations of [n] allowing i-&gt;i+j (mod n), j=0..k-1.
 * @author Sean A. Irvine
 */
public class A008305 implements Sequence {

  private int mN = 0;
  private int mK = 1;

  protected Z a(final int n, final int k) {
    final MatrixRing<Z> ring = new MatrixRing<>(n, Integers.SINGLETON);
    final DefaultMatrix<Z> m = new DefaultMatrix<>(n, n, Z.ZERO);
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        if ((j - i >= 0 && j - i < k) || j - i < k - n) {
          m.set(i, j, Z.ONE);
        }
      }
    }
    return ring.permanent(m);
  }

  @Override
  public Z next() {
    if (mK > mN) {
      ++mN;
      mK = 1;
    }
    return a(mN, mK++);
  }
}


