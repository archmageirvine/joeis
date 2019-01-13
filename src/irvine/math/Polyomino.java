package irvine.math;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

  private Polyomino bestNaturalOr180() {
    final long[] natural = syndrome();
    // Compute 180 degree syndrome without explicitly creating the polyomino
    final long[] rotate180 = new long[mExtentY + 1];
    for (final Point cell : this) {
      rotate180[mExtentY - cell.right()] |= 1L << cell.left();
    }
    return compare(natural, rotate180) <= 0 ? this : rotate180();
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
  
  /**
   * Return the canonical form of this polyomino considered as a one-sided polyomino.
   * @return canonical form
   */
  public Polyomino oneSidedCanonical() {
    final Polyomino zeroed = translate();
    final int extentX = zeroed.mExtentX;
    final int extentY = zeroed.mExtentY;
    if (extentX < extentY) {
      // Rotate by 90 degrees to make x direction longer and try again
      return zeroed.rotate90().oneSidedCanonical();
    }
    if (extentX > extentY) {
      // Choose between this orientation and rotation by 180
      return zeroed.bestNaturalOr180();
    }
    // Tie in x and y extent, need to explore further symmetries
    final Polyomino natural = zeroed.bestNaturalOr180();
    final Polyomino rotate90 = zeroed.rotate90().bestNaturalOr180();
    final Polyomino rotate270 = zeroed.rotate270().bestNaturalOr180();
    final long[] nat = natural.syndrome();
    final long[] r90 = rotate90.syndrome();
    final long[] r270 = rotate270.syndrome();
    if (compare(nat, r90) <= 0) {
      if (compare(nat, r270) <= 0) {
        return natural;
      } else {
        return rotate270;
      }
    } else if (compare(r90, r270) <= 0) {
      return rotate90;
    } else {
      return rotate270;
    }
  }

  /**
   * Return the canonical form of this polyomino considered as a two-sided rectangular polyomino.
   * These do NOT support rotation by 90 or 270 degrees.
   * @return canonical form
   */
  public Polyomino twoSidedRectangleCanonical() {
    final Polyomino zeroed = translate();
    // Tie in x and y extent, need to explore further symmetries
    final Polyomino natural = zeroed.bestNaturalOr180();
    final Polyomino leftRight = zeroed.reflectHorizontal().bestNaturalOr180();
    final Polyomino upDown = zeroed.reflectVertical().bestNaturalOr180();
    final long[] nat = natural.syndrome();
    final long[] lr = leftRight.syndrome();
    final long[] ud = upDown.syndrome();
    if (compare(nat, lr) <= 0) {
      if (compare(nat, ud) <= 0) {
        return natural;
      } else {
        return upDown;
      }
    } else if (compare(lr, ud) <= 0) {
      return leftRight;
    } else {
      return upDown;
    }
  }

  private void fillIt(final boolean[][] marks, final int extentX, final int extentY, final int x, final int y) {
    if (x < 0 || y < 0 || x > extentX || y > extentY || marks[x][y]) {
      return;
    }
    marks[x][y] = true;
    fillIt(marks, extentX, extentY, x + 1, y);
    fillIt(marks, extentX, extentY, x - 1, y);
    fillIt(marks, extentX, extentY, x, y + 1);
    fillIt(marks, extentX, extentY, x, y - 1);
  }

  /**
   * Test if the polyomino contains any holes.
   * @return true iff the polyomino has a hole
   */
  public boolean isHoly() {
    // This works even if the polyomino is not translated to zero
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int maxY = Integer.MIN_VALUE;
    for (final Point cell : this) {
      minX = Math.min(minX, cell.left());
      maxX = Math.max(maxX, cell.left());
      minY = Math.min(minY, cell.right());
      maxY = Math.max(maxY, cell.right());
    }
    final int extentX = maxX - minX;
    final int extentY = maxY - minY;
    final boolean[][] marks = new boolean[extentX + 1][extentY + 1];
    for (final Point cell : this) {
      marks[cell.left() - minX][cell.right() - minY] = true;
    }
    for (int x = 0; x <= extentX; ++x) {
      fillIt(marks, extentX, extentY, x, 0);
      fillIt(marks, extentX, extentY, x, extentY);
    }
    for (int y = 1; y < extentY; ++y) {
      fillIt(marks, extentX, extentY, 0, y);
      fillIt(marks, extentX, extentY, extentX, y);
    }
    for (int x = 0; x <= extentX; ++x) {
      final boolean[] row = marks[x];
      for (int y = 0; y <= extentY; ++y) {
        if (!row[y]) {
          return true;
        }
      }
    }
    return false;
  }

  private void bumpCount(final Map<Point, Integer> pts, final Point p) {
    pts.merge(p, 1, (x, y) -> x + y);
  }

  /**
   * Compute the perimeter of the polyomino.
   * @return perimeter
   */
  public int perimeter() {
    // Compute perimeter by expanding shape outwards in all possible ways,
    // then removing the original shape
    final HashMap<Point, Integer> pts = new HashMap<>();
    for (final Point p : this) {
      bumpCount(pts, new Point(p.left() + 1, p.right()));
      bumpCount(pts, new Point(p.left() - 1, p.right()));
      bumpCount(pts, new Point(p.left(), p.right() + 1));
      bumpCount(pts, new Point(p.left(), p.right() - 1));
    }
    pts.keySet().removeAll(this);
    int perimeter = 0;
    for (final Integer p : pts.values()) {
      perimeter += p;
    }
    return perimeter;
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
