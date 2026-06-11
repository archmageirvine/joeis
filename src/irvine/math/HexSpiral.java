package irvine.math;

public class HexSpiral {

  private static final int[][] DIR = {
    {0, 1},
    {-1, 1},
    {-1, 0},
    {0, -1},
    {1, -1},
    {1, 0}
  };

  private long mIndex = -1;
  private int mRing = 0;
  private int mPos = 0;

  /**
   * Pack axial coordinates into a long.
   * @param q coordinate
   * @param r coordinate
   * @return packed point
   */
  public static long pack(final int q, final int r) {
    return ((long) q << 32) | (r & 0xFFFFFFFFL);
  }

  /**
   * First axial coordinate.
   * @param p point
   * @return coordinate
   */
  public static int q(final long p) {
    return (int) (p >> 32);
  }

  /**
   * Second axial coordinate.
   * @param p point
   * @return coordinate
   */
  public static int r(final long p) {
    return (int) p;
  }

  /**
   * Axial coordinates of point.
   * @param p point
   * @return coordinates as a string
   */
  public static String toString(final long p) {
    return "(" + q(p) + "," + r(p) + ")";
  }

  private static long point(final int ring, final int k) {
    if (ring == 0) {
      return pack(0, 0);
    }

    final int kk = (k + 1) % (6 * ring);

    int q = ring;
    int r = -ring;
    int t = kk;

    for (int side = 0; side < 6; ++side) {
      if (t < ring) {
        return pack(q + t * DIR[side][0], r + t * DIR[side][1]);
      }
      q += ring * DIR[side][0];
      r += ring * DIR[side][1];
      t -= ring;
    }
    throw new IllegalStateException();
  }

  /**
   * Return the next point in the spiral.
   * @return point
   */
  public long next() {
    ++mIndex;
    if (mIndex == 0) {
      return pack(0, 0);
    }
    if (mPos == 6 * mRing) {
      ++mRing;
      mPos = 0;
    }
    return point(mRing, mPos++);
  }
}
