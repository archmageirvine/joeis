package irvine.math.group;

import irvine.math.api.Matrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.CyclotomicExtension;
import irvine.math.q.Q;

/**
 * The character table of a dihedral group.
 * @author Sean A. Irvine
 */
public class DihedralCharacterTable {

  private static final Polynomial<Q> ONE = Polynomial.create(Q.ONE);
  private static final Polynomial<Q> NEG_ONE = Polynomial.create(Q.NEG_ONE);
  private static final Polynomial<Q> TWO = Polynomial.create(Q.TWO);
  private static final Polynomial<Q> NEG_TWO = Polynomial.create(Q.valueOf(-2));
  private final int mN;
  private final CyclotomicExtension mRing;
  private final Matrix<Polynomial<Q>> mCharTable;

  /**
   * The character table of the dihedral group of order 2n.
   * @param n number of rotations
   */
  public DihedralCharacterTable(final int n) {
    mN = n;
    mRing = new CyclotomicExtension(n);
    //mRing = new RationalUnityExtension("x", n, Q.ONE);
    final int dim = (mN & 1) == 0 ? mN / 2 + 3 : (mN + 3) / 2;
    mCharTable = new DefaultMatrix<>(dim, dim, mRing.zero());
    final int rotationCols = (mN & 1) == 0 ? mN / 2 + 1 : (mN + 1) / 2;

    // Linear characters
    final int linearRows = (mN & 1) == 0 ? 4 : 2;
    fillLinearCharacters(linearRows, rotationCols);

    // Two-dimensional characters
    final int twoDimensionalRows = dim - linearRows;
    fillTwoDimensionalCharacters(twoDimensionalRows, linearRows, rotationCols);
  }

  private void fillLinearCharacters(final int linearRows, final int rotationCols) {
    for (int row = 0; row < linearRows; ++row) {
      final int rSign = (mN & 1) == 0 && row >= 2 ? -1 : 1;
      final int sSign = (row & 1) == 1 ? -1 : 1;

      for (int k = 0; k < rotationCols; ++k) {
        mCharTable.set(row, k, rSign == 1 || (k & 1) == 0 ? ONE : NEG_ONE);
      }

      // reflection columns handled separately
      if ((mN & 1) == 0) {
        for (int c = rotationCols; c < mCharTable.cols(); ++c) {
          final int parity = c - rotationCols;
          final int sign = sSign * (parity == 0 || rSign == 1 ? 1 : -1);
          mCharTable.set(row, c, sign == 1 ? ONE : NEG_ONE);
        }
      } else {
        for (int c = rotationCols; c < mCharTable.cols(); ++c) {
          mCharTable.set(row, c, sSign == 1 ? ONE : NEG_ONE);
        }
      }
    }
  }

  private void fillTwoDimensionalCharacters(final int rows, final int linearRows, final int rotationCols) {
    for (int representation = 1; representation <= rows; ++representation) {
      final int row = linearRows + representation - 1;
      for (int k = 0; k < rotationCols; ++k) {
        mCharTable.set(row, k, trace(representation * k));
      }
      // reflections remain zero
    }
  }

  private Polynomial<Q> trace(int k) {
    k %= mN;
    if (k == 0) {
      return TWO;
    }
    if (2 * k == mN) {
      return NEG_TWO;
    }
    return mRing.add(mRing.monomial(Q.ONE, k), mRing.monomial(Q.ONE, mN - k));
  }

  /**
   * The number of rotations in the underlying group.
   * @return rotations
   */
  public int rotations() {
    return mN;
  }

  /**
   * Total order of the group (twice the rotations).
   * @return order
   */
  public int size() {
    return 2 * mN;
  }

  /**
   * Return the underlying ring for the elements of the character table.
   * @return unity ring
   */
  public CyclotomicExtension ring() {
    return mRing;
  }

  /**
   * Return the entire character table as a matrix.
   * @return character table
   */
  public Matrix<Polynomial<Q>> matrix() {
    return mCharTable;
  }

  /**
   * Number of rows in the character table.
   * @return rows
   */
  public long rows() {
    return mCharTable.rows();
  }

  /**
   * Number of columns in the character table.
   * @return columns
   */
  public long cols() {
    return mCharTable.cols();
  }

  /**
   * Print the character table for a particular dihedral group.
   * @param args n
   */
  public static void main(final String[] args) {
    System.out.println(new DihedralCharacterTable(Integer.parseInt(args[0])).matrix());
  }
}
