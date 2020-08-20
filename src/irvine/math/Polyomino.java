package irvine.math;

import java.util.HashSet;

import irvine.util.Point;

/**
 * Representation of a polyomino.
 * @author Sean A. Irvine
 */
public class Polyomino extends HashSet<Point> {
  
  private int mExtentX = 0;
  private int mExtentY = 0;

  /** Construct an empty polyomino. */
  public Polyomino() {
    super();
    mExtentX = 0;
    mExtentY = 0;
  }

  /**
   * Construct a polyomino from an existing polyomino.
   * @param poly existing polyomino
   */
  public Polyomino(final Polyomino poly) {
    super(poly);
    mExtentX = poly.mExtentX;
    mExtentY = poly.mExtentY;
  }

  @Override
  public boolean add(final Point e) {
    mExtentX = Math.max(mExtentX, e.left());
    mExtentY = Math.max(mExtentY, e.right());
    return super.add(e);
  }

  @Override
  public boolean remove(final Object e) {
    final boolean r = super.remove(e);
    final Point p = (Point) e;
    if (p.left() == mExtentX || p.right() == mExtentY) {
      // recompute extents
      mExtentX = 0;
      mExtentY = 0;
      for (final Point q : this) {
        mExtentX = Math.max(mExtentX, q.left());
        mExtentY = Math.max(mExtentY, q.right());
      }
    }
    return r;
  }

  private int compare(final long[] a, final long[] b) {
    assert a.length == b.length;
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return 1;
      }
      if (a[k] < b[k]) {
        return -1;
      }
    }
    return 0;
  }

  /**
   * Translate the polyomino so it has no negative cells, but so that
   * it touches x = 0 and y = 0 somewhere in its structure.
   * @return translated polyomino
   */
  public Polyomino translate() {
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    for (final Point cell : this) {
      minX = Math.min(minX, cell.left());
      minY = Math.min(minY, cell.right());
    }
    if (minX == 0 && minY == 0) {
      return this;
    }
    final Polyomino translate = new Polyomino();
    for (final Point cell : this) {
      translate.add(new Point(cell.left() - minX, cell.right() - minY));
    }
    return translate;
  }

  /**
   * The horizontal reflection of this polyomino.
   * @return reflection
   */
  public Polyomino reflectHorizontal() {
    final Polyomino res = new Polyomino();
    for (Point cell : this) {
      res.add(new Point(mExtentX - cell.left(), cell.right()));
    }
    return res;
  }

  /**
   * The vertical reflection of this polyomino.
   * @return reflection
   */
  public Polyomino reflectVertical() {
    final Polyomino res = new Polyomino();
    for (Point cell : this) {
      res.add(new Point(cell.left(), mExtentY - cell.right()));
    }
    return res;
  }

  /**
   * Rotate polyomino by 180 degrees.
   * @return rotated polyomino
   */
  public Polyomino rotate180() {
    final Polyomino res = new Polyomino();
    for (Point cell : this) {
      res.add(new Point(mExtentX - cell.left(), mExtentY - cell.right()));
    }
    return res;
  }

  /**
   * Rotate polyomino by 90 degrees.
   * @return rotated polyomino
   */
  public Polyomino rotate90() {
    final Polyomino res = new Polyomino();
    for (Point cell : this) {
      res.add(new Point(cell.right(), mExtentX - cell.left()));
    }
    return res;
  }

  /**
   * Rotate polyomino by 270 degrees.
   * @return rotated polyomino
   */
  public Polyomino rotate270() {
    final Polyomino res = new Polyomino();
    for (Point cell : this) {
      res.add(new Point(mExtentY - cell.right(), cell.left()));
    }
    return res;
  }

  /**
   * Swap x and y coordinates
   * @return polyomino
   */
  public Polyomino swap() {
    final Polyomino res = new Polyomino();
    for (Point cell : this) {
      res.add(new Point(cell.right(), cell.left()));
    }
    return res;
  }

  private Polyomino bestNaturalOrReflection() {
    // Rule 2: sort so that longest runs from bottom left.
    // There are four cases to consider, depending on left-right reflection
    // and rotation by 180 degrees
    final long[] natural = syndrome();
    final long[] reflect = new long[mExtentY + 1];
    final long[] rotate = new long[mExtentY + 1];
    final long[] reflectAndRotate = new long[mExtentY + 1];
    // Compute syndromes without explicitly computing polyomino
    for (final Point cell : this) {
      final int x = cell.left();
      final int y = cell.right();
      reflect[y] |= 1L << x;
      reflectAndRotate[mExtentY - y] |= 1L << (mExtentX - x);
      rotate[mExtentY - y] |= 1L << x;
    }
    final Polyomino res;
    final int c1 = compare(natural, reflect);
    if (c1 <= 0) {
      final int c2 = compare(natural, rotate);
      if (c2 <= 0) {
        final int c3 = compare(natural, reflectAndRotate);
        if (c3 <= 0) {
          res = this;
        } else {
          res = reflectVertical();
        }
      } else {
        final int c3 = compare(rotate, reflectAndRotate);
        if (c3 <= 0) {
          res = rotate180();
        } else {
          res = reflectVertical();
        }
      }
    } else {
      final int c2 = compare(reflect, rotate);
      if (c2 <= 0) {
        final int c3 = compare(reflect, reflectAndRotate);
        if (c3 <= 0) {
          res = reflectHorizontal();
        } else {
          res = reflectVertical();
        }
      } else {
        final int c3 = compare(rotate, reflectAndRotate);
        if (c3 <= 0) {
          res = rotate180();
        } else {
          res = reflectVertical();
        }
      }
    }
    return res;
  }

  private long[] syndrome() {
    final long[] natural = new long[mExtentY + 1];
    for (final Point cell : this) {
      final int x = cell.left();
      final int y = cell.right();
      natural[y] |= 1L << (mExtentX - x);
    }
    return natural;
  }

  /**
   * Return the canonical form of this polyomino considered as a free polyomino.
   * @return canonical form
   */
  public Polyomino freeCanonical() {
    final Polyomino zeroed = translate();
    final int extentX = zeroed.mExtentX;
    final int extentY = zeroed.mExtentY;
    if (extentX < extentY) {
      return zeroed.swap().freeCanonical();
    }
    if (extentX > extentY) {
      return zeroed.bestNaturalOrReflection();
    }
    // Tie in x and y extent, need to explore further symmetries
    final Polyomino natural = zeroed.bestNaturalOrReflection();
    final Polyomino swap = zeroed.swap().bestNaturalOrReflection();
    if (compare(natural.syndrome(), swap.syndrome()) <= 0) {
      return natural;
    } else {
      return swap;
    }
  }
  
  @Override
  public int hashCode() {
    return super.hashCode() * (mExtentX + 1) * (mExtentY + 1);
  }
  
  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Polyomino)) {
      return false;
    }
    final Polyomino p = (Polyomino) other;
    return mExtentX == p.mExtentX && mExtentY == p.mExtentY && super.equals(other);
  }
}
