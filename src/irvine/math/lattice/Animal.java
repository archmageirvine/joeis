package irvine.math.lattice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import irvine.math.LongUtils;

/**
 * An animal or polyomino.
 * @author Sean A. Irvine
 */
public class Animal implements Comparable<Animal> {

  private final long[] mAnimal;
  private final int mHashCode;

  /**
   * Construct an animal with the specified points.
   * @param points points
   */
  public Animal(final long... points) {
    mAnimal = points;
    Arrays.sort(points);
    mHashCode = Arrays.hashCode(mAnimal);
  }

  /**
   * Construct a new animal from an existing animal with one extra point.
   * @param animal existing animals
   * @param q extra point
   */
  public Animal(final Animal animal, final long q) {
    mAnimal = Arrays.copyOf(animal.mAnimal, animal.mAnimal.length + 1);
    // Previous points are sorted, so just propagate the point q to correct location
    int k = mAnimal.length - 1;
    while (--k >= 0) {
      if (mAnimal[k] < q) {
        break;
      }
      mAnimal[k + 1] = mAnimal[k];
    }
    mAnimal[k + 1] = q;
    Arrays.sort(mAnimal);
    mHashCode = Arrays.hashCode(mAnimal);
  }

  /**
   * Test if this animal contains the specified point.
   * @param point the point
   * @return true iff the point is in the animal
   */
  public boolean contains(final long point) {
//    for (final long p : mAnimal) {
//      if (p == point) {
//        return true;
//      }
//    }
//    return false;
    return Arrays.binarySearch(mAnimal, point) >= 0;
  }

  /**
   * Return the maximum value of the specified coordinate of this animal with
   * respect to the specified lattice.
   * @param lattice underlying lattice
   * @param dimension dimension number
   * @return maximum value in specified dimension
   */
  public long extent(final Lattice lattice, final int dimension) {
    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;
    for (final long p : mAnimal) {
      final long c = lattice.ordinate(p, dimension);
      min = Math.min(min, c);
      max = Math.max(max, c);
    }
    return max - min;
  }

  /**
   * Size of this animal.
   * @return size
   */
  public int size() {
    return mAnimal.length;
  }

  /**
   * Return actual points in the animal.  Callers should not modify the result.
   * @return points
   */
  public long[] points() {
    return mAnimal;
  }

  /**
   * Return the size of the perimeter of this animal with respect to the specified lattice.
   * @param lattice the underlying lattice
   * @return perimeter size
   */
  public int perimeterSize(final Lattice lattice) {
    final HashSet<Long> perim = new HashSet<>();
    for (final long p : mAnimal) {
      for (int k = 0; k < lattice.neighbourCount(p); ++k) {
        perim.add(lattice.neighbour(p, k));
      }
    }
    for (final long p : mAnimal) {
      perim.remove(p);
    }
    return perim.size();
  }

  /**
   * Return this animal enlarged by its perimeter.
   * @param lattice the underlying lattice
   * @return perimeter size
   */
  public Animal perimeter(final Lattice lattice) {
    final HashSet<Long> perim = new HashSet<>();
    for (final long p : mAnimal) {
      perim.add(p);
      for (int k = 0; k < lattice.neighbourCount(p); ++k) {
        perim.add(lattice.neighbour(p, k));
      }
    }
    final long[] a = new long[perim.size()];
    int k = 0;
    for (final long point : perim) {
      a[k++] = point;
    }
    return new Animal(a);
  }

  /**
   * Return the size of edge perimeter of this animal with respect to the specified lattice
   * @param lattice the underlying lattice
   * @return perimeter size
   */
  public int edgePerimeterSize(final Lattice lattice) {
    final Map<Long, Integer> pts = new HashMap<>();
    for (final long p : mAnimal) {
      for (int k = 0; k < lattice.neighbourCount(p); ++k) {
        pts.merge(lattice.neighbour(p, k), 1, Integer::sum);
      }
    }
    for (final long p : mAnimal) {
      pts.keySet().remove(p);
    }
    int perimeter = 0;
    for (final Integer p : pts.values()) {
      perimeter += p;
    }
    return perimeter;

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
   * Test if the animal contains any holes.
   * @return true iff the animal has a hole
   */
  public boolean isHoly(final Lattice lattice) {
    final int dim = lattice.dimension();
    if (dim != 2) {
      // Be nice to remove this limitation
      throw new UnsupportedOperationException();
    }
    final long[] min = new long[dim];
    Arrays.fill(min, Long.MAX_VALUE);
    final long[] max = new long[dim];
    Arrays.fill(max, Long.MIN_VALUE);
    for (final long p : mAnimal) {
      for (int k = 0; k < dim; ++k) {
        min[k] = Math.min(min[k], lattice.ordinate(p, k));
        max[k] = Math.max(max[k], lattice.ordinate(p, k));
      }
    }
    final long[] extent = new long[dim];
    for (int k = 0; k < dim; ++k) {
      extent[k] = max[k] - min[k];
    }

    // From here on, currently limited to 2D (in fact probably only correct for Z2)
    final int extentX = (int) extent[0];
    final int extentY = (int) extent[1];
    final boolean[][] marks = new boolean[extentX + 1][extentY + 1];
    for (final long cell : mAnimal) {
      marks[(int) (lattice.ordinate(cell, 0) - min[0])][(int) (lattice.ordinate(cell, 1) - min[1])] = true;
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

  /**
   * Return this animal with one points removed
   * @param pointNumber point to remove <code>0 &le; pointNumber &lt; size()</code>
   * @return reduced animal
   */
  public Animal remove(final int pointNumber) {
    final long[] pts = new long[size() - 1];
    System.arraycopy(mAnimal, 0, pts, 0, pointNumber);
    System.arraycopy(mAnimal, pointNumber + 1, pts, pointNumber, size() - pointNumber - 1);
    return new Animal(pts);
  }

  @Override
  public int compareTo(final Animal o) {
    return LongUtils.compare(mAnimal, o.mAnimal);
  }

  @Override
  public boolean equals(final Object obj) {
    return obj instanceof Animal && Arrays.equals(mAnimal, ((Animal) obj).mAnimal);
  }

  @Override
  public int hashCode() {
    return mHashCode;
  }

  /**
   * String representation of this animal.
   * @param lattice underlying lattice
   * @return string representation
   */
  public String toString(final Lattice lattice) {
    final StringBuilder sb = new StringBuilder();
    for (final long p : mAnimal) {
      if (sb.length() > 0) {
        sb.append(',');
      }
      sb.append(lattice.toString(p));
    }
    return sb.toString();
  }
}
