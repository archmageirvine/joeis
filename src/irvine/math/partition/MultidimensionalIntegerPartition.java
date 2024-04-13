package irvine.math.partition;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate multidimensional integer partitions.  Uses algorithm 313,
 * Multi-dimensional Partition Generator by Bratley and McKay.
 *
 * @author Sean A. Irvine
 */
public final class MultidimensionalIntegerPartition {

  /**
   * Convert from the node form of the Bratley-McKay representation to a Ferrier form.
   * @param partition partition in Bratley-McKay representation
   * @return partition in Ferrier form
   */
  public static List<List<Integer>> nodesToFerrier(final int[][] partition) {
    // Convert from the node form of the Bratley-McKay representation to a Ferrier form.
    // Essentially each column of the 2-d partition array specifies the coordinates of
    // a filled cell in the Ferrier representation.
    // See http://en.wikipedia.org/wiki/Plane_partition

    // In our case the last dimension is already always 0 (because we have
    // already applied the UnitPartitionFilter) hence we go to one less dimension.
    // Actually the above comment is only true for A002723 ...
    // Use of this procedure elsewhere might be problematic
    final int n = partition[0].length;
    final List<List<Integer>> ferrier = new ArrayList<>(n);
    for (int k = 1; k < n; ++k) {
      final ArrayList<Integer> coords = new ArrayList<>(partition.length - 1);
      for (int d = 0; d < partition.length - 1; ++d) { // Unit in last dimension
        coords.add(partition[d][k]);
      }
      ferrier.add(coords);
    }
    return ferrier;
  }

  /**
   * Callback for partitions as they are generated.
   */
  public interface PartitionUser {
    /**
     * Called for each partition as it is generated.
     * @param partition the partition description
     */
    void use(final int[][] partition);
  }

  private final int mN;
  private final int mDim;
  private final int[][] mCurrent;
  private final int[][] mX;

  /**
   * Construct a new object for getting the integer partitions of a number.
   * @param n number to partition
   * @param dim number of dimensions
   * @exception IllegalArgumentException if <code>n</code> or <code>dim</code>is not positive.
   */
  public MultidimensionalIntegerPartition(final int n, final int dim) {
    if (n < 1 || dim < 1) {
      throw new IllegalArgumentException();
    }
    mN = n;
    mDim = dim + 1;
    mCurrent = new int[mDim][n + 1];
    mX = new int[mDim][n * mDim];
  }

  private void part(final PartitionUser use, final int n, final int q, final int r) {
    for (int p = q; p < r; ++p) {
      for (int i = 0; i < mDim; ++i) {
        mCurrent[i][n] = mX[i][p];
      }
      if (n == mN) {
        use.use(mCurrent);
      } else {
        int s = r;
        l5:
        for (int i = 0; i < mDim; ++i) {
          for (int j = 0; j < mDim; ++j) {
            mX[j][s] = mX[j][p];
          }
          mX[i][s]++;
          l3:
          for (int j = 0; j < mDim; ++j) {
            if (mX[j][s] != 0) {
              l4:
              for (int k = 1; k <= n; ++k) {
                for (int m = 0; m < mDim; ++m) {
                  if (mCurrent[m][k] != mX[m][s] - (j == m ? 1 : 0)) {
                    continue l4;
                  }
                }
                continue l3;
              }
              continue l5;
            }
          }
          ++s;
        }
        part(use, n + 1, p + 1, s);
      }
    }
  }

  /**
   * Sequentially generate all the partitions for the configuration, passing them through to
   * the user.
   * @param user partition user
   */
  public void generate(final PartitionUser user) {
    part(user, 1, 0, 1);
  }

  /**
   * A simple partition user that simply counts the number of partitions.
   */
  public static class CountPartitionUser implements PartitionUser {
    private long mC = 0;

    @Override
    public void use(final int[][] partition) {
      ++mC;
    }

    /**
     * Return the count of the partitions.
     * @return count of partitions
     */
    public long count() {
      return mC;
    }
  }

  /**
   * Compute the number of partitions for this instance.
   * @return count
   */
  public long count() {
    final CountPartitionUser user = new CountPartitionUser();
    generate(user);
    return user.count();
  }

  /**
   * Print count of integer partitions of given argument at given dimension.
   * @param args arguments
   */
  public static void main(final String[] args) {
    final MultidimensionalIntegerPartition ip = new MultidimensionalIntegerPartition(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    System.out.println(ip.count());
  }
}

