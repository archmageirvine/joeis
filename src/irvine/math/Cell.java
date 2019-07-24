package irvine.math;

/**
 * A cell in a 2-dimensional lattice or tiling.
 */
public final class Cell {

  private final int mX;
  private final int mY;
  private final char mK;

  /**
   * Construct a new cell.
   * @param x x-coordinate
   * @param y y-coordinate
   * @param k cell type
   */
  public Cell(final int x, final int y, final char k) {
    mX = x;
    mY = y;
    mK = k;
  }

  /**
   * Get the type of the cell.
   * @return the cell type
   */
  public char getType() {
    return mK;
  }

  public int getX() {
    return mX;
  }

  public int getY() {
    return mY;
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Cell)) {
      return false;
    }
    final Cell that = (Cell) obj;
    return that.mX == mX && that.mY == mY && that.mK == mK;
  }

  @Override
  public int hashCode() {
    return IntegerUtils.hash(mX, mY) * mK;
  }
}
