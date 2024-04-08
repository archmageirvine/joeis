package irvine.math.monoid;

/**
 * Generate commutative monoids.
 * This is more efficient that general all monoids.
 * @author Sean A. Irvine
 */
public final class CommutativeMonoids extends Monoids {

  // Although the resulting matrix is symmetric we fill in the entire matrix
  // so that downstream processors do not need to make a distinction between
  // these monoids and general monoids.

  /**
   * Construct a new object for generating commutative monoids of given order.
   * @param n order
   * @exception IllegalArgumentException if <code>n</code> is not positive.
   */
  public CommutativeMonoids(final int n) {
    super(n);
  }

  @Override
  protected void search(final MonoidProcessor processor, final int row, final int col) {
    if (row >= mN) {
      processor.process(mM);
      return;
    }
    // Choose possible element for (row, col)
    for (int k = 0; k < mN; ++k) {
      mM[row][col] = k;
      mM[col][row] = k;
      if (col == mN - 1) {
        if (isAssociative(row)) {
          search(processor, row + 1, row + 1);
        }
      } else {
        search(processor, row, col + 1);
      }
    }
  }
}
