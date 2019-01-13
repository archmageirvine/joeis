package irvine.math;

/**
 * A walk in two-dimensional integer space.
 *
 * @author Sean A. Irvine
 */
public class TwoDimensionalWalk {
  private final TwoDimensionalWalk mPrevious;
  private final int mX;
  private final int mY;

  /**
   * New walk.
   * @param x x coordinate
   * @param y y coordinate
   * @param previous previous part of walk or null
   */
  public TwoDimensionalWalk(final int x, final int y, final TwoDimensionalWalk previous) {
    mX = x;
    mY = y;
    mPrevious = previous;
  }

  /**
   * Check if this walk contains a particular node.
   * @param x x coordinate
   * @param y y coordinate
   * @return true if <code>(x,y)</code> is in the walk
   */
  public boolean contains(final int x, final int y) {
    return (mX == x && mY == y) || (mPrevious != null && mPrevious.contains(x, y));
  }

  /**
   * Check if this walk contains a particular edge.
   * @param x0 first x coordinate
   * @param y0 first y coordinate
   * @param x1 second x coordinate
   * @param y1 second y coordinate
   * @return true if <code>(x0,y0)-(x1,y1)</code> is in the walk
   */
  public boolean contains(final int x0, final int y0, final int x1, final int y1) {
    if (mPrevious == null) {
      return false;
    }
    return (mX == x0 && mY == y0 && mPrevious.mX == x1 && mPrevious.mY == y1)
      || (mX == x1 && mY == y1 && mPrevious.mX == x0 && mPrevious.mY == y0)
      || mPrevious.contains(x0, y0, x1, y1);
  }

  /**
   * Return x-coordinate of the head of the walk.
   * @return x coordinate
   */
  public int x() {
    return mX;
  }

  /**
   * Return y-coordinate of the head of the walk.
   * @return y coordinate
   */
  public int y() {
    return mY;
  }

  /**
   * Return the head of the previous step.
   * @return previous step
   */
  public TwoDimensionalWalk getPrevious() {
    return mPrevious;
  }

  /**
   * Return a bounding rectangle for the walk.
   * @return minimum x, maximum x, minimum y, maximum y
   */
  public int[] bounds() {
    final int[] res = {x(), x(), y(), y()};
    TwoDimensionalWalk p = mPrevious;
    while (p != null) {
      res[0] = Math.min(res[0], p.x());
      res[1] = Math.max(res[1], p.x());
      res[2] = Math.min(res[2], p.y());
      res[3] = Math.max(res[3], p.y());
      p = p.mPrevious;
    }
    return res;
  }

  @Override
  public String toString() {
    final String a = "(" + mX + "," + mY + ")";
    if (mPrevious == null) {
      return a;
    } else {
      return mPrevious.toString() + " -> " + a;
    }
  }
}

