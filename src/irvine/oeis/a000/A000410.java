package irvine.oeis.a000;

import java.util.Arrays;

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
  private MatrixRing<Z> mMatrixRing = null;

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

  // todo: make a reduction version operating directly on input (a copy of it!)
  private boolean isSingular2(final long[] rowsOrig) {
    // Perform row reduction using the assumption that the supplied rows are already
    // sorted to be increasing.  If we reach a point where a diagonal element is
    // forced to be zero in our partially constructed reduced matrix, then we know
    // the determinant must be zero.

    // This is close, but I think the mod2 addition screws up the determinant
    // in some instances, since we want the determinant over Z not F_2
    // i.e. I suspect this is only giving the parity of the determinant?
    // For example, det([[0,1,1],[1,0,1],[1,1,0]])=2, but this method can
    // only ever get 0 or 1 for the det.

    final long[] rows = Arrays.copyOf(rowsOrig, rowsOrig.length);
    long bit = 1L << (rows.length - 1);
    for (int k = rows.length - 1; k >= 0; --k, bit >>>= 1) {
      assert bit > 0;
      // If possible, find a row <= k with a leading one in column k
      for (int j = k; j >= 0; --j) {
        if ((rows[j] & bit) != 0) {
          final long t = rows[j];
          rows[j] = rows[k];
          rows[k] = t;
        }
      }
      if ((rows[k] & bit) == 0) {
        // There is no row with a 1 in column k -> det = 0 -> singular
        //System.out.println(Arrays.toString(rowsOrig) + " " + Arrays.toString(rows));
        return true;
      }
      // Now eliminate leading 1 from all other earlier rows
      for (int j = k - 1; j >= 0; --j) {
        if (rows[j] >= bit) {
          rows[j] ^= rows[k];
          assert rows[j] < bit;
        }
      }
    }
    return false; //rows[0] == 0;
  }

  private boolean isSingular(final long[] rows) {
    // this is the slow part -- it would be much quicker if could compute the
    // determinant directly on the packed representation in rows
    final DefaultMatrix<Z> m = new DefaultMatrix<>(rows.length, rows.length, Z.ZERO);
    for (int k = 0; k < rows.length; ++k) {
      long r = rows[k];
      for (int j = 0; j < rows.length; ++j, r >>>= 1) {
        if ((r & 1) == 1) {
          m.set(k, j, Z.ONE);
        }
      }
    }
    return Z.ZERO.equals(mMatrixRing.det(m));
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    mMatrixRing = new MatrixRing<>(mN, Integers.SINGLETON);
    final long limit = 1L << mN;
    final long[] rows = new long[mN];
    for (int k = 0; k < rows.length; ++k) {
      rows[k] = k + 1;
    }
    long count = 0;
    do {
      if (isSingular(rows)) {
        ++count;
      }
    } while (bump(rows, limit));
    return Z.valueOf(count);
  }
}
