package irvine.math.lattice;

import java.util.Arrays;
import java.util.HashSet;

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
  Animal(final long... points) {
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
    long max = Integer.MIN_VALUE;
    for (final long p : mAnimal) {
      max = Math.max(max, lattice.ordinate(p, dimension));
    }
    return max;
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
  long[] points() {
    return mAnimal;
  }

  /**
   * Return the size of the perimeter of this animal with respect to the specified lattice.
   * @param lattice underlying lattice
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
