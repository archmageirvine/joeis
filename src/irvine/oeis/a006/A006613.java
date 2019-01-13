package irvine.oeis.a006;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.PopCount;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006613.
 * @author Sean A. Irvine
 */
public class A006613 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected int mN = init();
  private int mK = 5;

  protected int init() {
    return j() - 1;
  }

  protected int j() {
    return 3;
  }

  protected int cols() {
    return mN;
  }

  private boolean checkMin(final int[] p, final int n) {
    int count = 0;
    for (final int q : p) {
      if (q >= n) {
        ++count;
      }
    }
    return count >= 2;
  }

  protected boolean isZarankiewicz(final long[] matrix) {
    // Check exists a 2xj submatrix all ones
    for (int row1 = 0; row1 < matrix.length; ++row1) {
      final long r1 = matrix[row1];
      if (PopCount.popcount(r1) >= j()) {
        for (int row2 = row1 + 1; row2 < matrix.length; ++row2) {
          final long r2 = matrix[row2] & r1;
          if (PopCount.popcount(r2) >= j()) {
            // Found pair of rows with at least j ones in same place, hence exist column selection
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean bump(final long[] start, final long[] matrix) {
    // Step to the next possible matrix with the same number of 1s as the given
    // matrix in each row.  Once all such matrices are exhausted return false.
    final long maskLimit = 1L << cols();
    for (int k = matrix.length - 1; k >= 0; --k) {
      final long t = LongUtils.swizzle(matrix[k]);
      if (t < maskLimit) {
        matrix[k] = t;
        return true;
      } else {
        matrix[k] = start[k];
      }
    }
    return false;
  }

  private boolean isZarankiewicz(final long[] start, final long[] matrix) {
    //dump(matrix);
    // Check that every matrix generated by swizzling the start matrix is Zarankiewicz
    do {
      if (!isZarankiewicz(matrix)) {
        return false; // Found a matrix without all 1s 2xj submatrix
      }
    } while (bump(start, matrix));
    return true;
  }

//  private void dump(final long[] matrix) {
//    for (final long m : matrix) {
//      final String s = Long.toBinaryString(m | (1L << 62));
//      System.out.println(s.substring(s.length() - cols()));
//    }
//  }

  private boolean zarankiewicz(final int n, final int k) {
    // For every n x cols() binary matrix (n >= j) we are to insert k ones
    // If there exists a n x cols() matrix with a 2xj submatrix not all 1s, then
    // false is returned, otherwise true.
    assert cols() >= j();
    if (mVerbose) {
      System.out.println("Trying k=" + k);
    }

    // A simple condition is that every row of the matrix must contain at least 3 ones.
    // So we want partitions of k into n parts with every part at least 3.
    final IntegerPartition part = new IntegerPartition(k);
    final long[] matrix = new long[n];
    final long[] start = new long[n];
    int[] p;
    boolean ok = false;
    while ((p = part.next()) != null) {
      // Only consider partitions with n parts and each part <= n
      // (i.e. fitting within n x n matrix)
      if (p.length == n && IntegerUtils.max(p) <= cols()) {
        //System.out.println("Partition: " + Arrays.toString(p));
        if (checkMin(p, j())) {
          //System.out.println("Accepted for matrix generation");
          // Build the packed binary matrix with 1s according to the partition
          for (int row = 0; row < p.length; ++row) {
            matrix[row] = (1L << p[row]) - 1;
          }
          System.arraycopy(matrix, 0, start, 0, matrix.length);
          if (!isZarankiewicz(start, matrix)) {
            return false; // Found a matrix that does not work, this k is too small
          }
          ok = true; // Partition passed
        } else {
          return false; // Eliminated this k because exists rows with insufficient 1s
        }
      }
    }
    return ok; // Every valid partition passed matrix testing
  }

  private int zarankiewicz(final int n) {
    // Find minimum k satisfying Zarankiewicz condition
    while (!zarankiewicz(n, mK)) {
      ++mK;
    }
    return mK;
  }

  @Override
  public Z next() {
    return Z.valueOf(zarankiewicz(++mN));
  }
}

