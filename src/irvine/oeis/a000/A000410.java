package irvine.oeis.a000;

import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000410.
 * @author Sean A. Irvine
 */
public class A000410 implements Sequence {

  private int mN = 0;

  private boolean bump(final long[] rows, final long limit) {
    long l = limit;
    for (int k = rows.length - 1; k >= 0; --k, --l) {
      if (++rows[k] < l) {
        for (int j = k + 1; j < rows.length; ++j) {
          rows[j] = rows[j - 1] + 1;
        }
        return true;
      }
    }
    return false;
  }

  private DefaultMatrix<Z> getZMatrix(final long[] rows) {
    final DefaultMatrix<Z> m = new DefaultMatrix<>(rows.length, rows.length, Z.ZERO);
    for (int k = 0; k < rows.length; ++k) {
      long r = rows[k];
      for (int j = 0; j < rows.length; ++j, r >>>= 1) {
        if ((r & 1) == 1) {
          m.set(k, j, Z.ONE);
        }
      }
    }
    return m;
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    final MatrixRing<Z> matrixRing = new MatrixRing<>(mN, Integers.SINGLETON);
    final long limit = 1L << mN;
    final long[] rows = new long[mN];
    for (int k = 0; k < rows.length; ++k) {
      rows[k] = k + 1;
    }
    long count = 0;
    do {
      if (matrixRing.isSingular(getZMatrix(rows))) {
        ++count;
      }
    } while (bump(rows, limit));
    return Z.valueOf(count);
  }
}
