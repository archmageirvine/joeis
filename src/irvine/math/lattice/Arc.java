package irvine.math.lattice;

import java.util.Arrays;

/**
 * Support functions for the arc lattice.
 * @author Sean A. Irvine
 */
public final class Arc {

  private Arc() {
  }

  private static final Lattice L = Lattices.ARC;
  private static final long[] ROTATE_Z = {1, 2, 3, 0, 5, 6, 7, 4};
  private static final long[] REFLECT_Z = {1, 0, 3, 2, 5, 4, 7, 6};

  /**
   * Rotate the given point by 60 degrees anticlockwise.
   * @param point point to rotate
   * @return rotated point
   */
  public static long rotate(final long point) {
    final long x = L.ordinate(point, 0);
    final long y = L.ordinate(point, 1);
    final long z = L.ordinate(point, 2);
    return L.toPoint(-y, x, ROTATE_Z[(int) z]);
  }

  /**
   * Translate points to a canonical position.
   * @param points points to translate
   * @return translated points
   */
  private static long[] translate(final long[] points) {
    long minX = Long.MAX_VALUE;
    long minY = Long.MAX_VALUE;
    for (final long p : points) {
      final long x = L.ordinate(p, 0);
      if (x < minX) {
        minX = x;
      }
      final long y = L.ordinate(p, 1);
      if (y < minY) {
        minY = y;
      }
    }
    if (minX == 0 && minY == 0) {
      return points; // already in canonical position
    }
    final long[] translate = new long[points.length];
    int k = 0;
    for (final long point : points) {
      final long x = L.ordinate(point, 0);
      final long y = L.ordinate(point, 1);
      final long z = L.ordinate(point, 2);
      translate[k++] = L.toPoint(x - minX, y - minY, z);
    }
    return translate;
  }

  /**
   * Translate an animal to a canonical position.
   * @param animal animal to translate
   * @return translated animal
   */
  public static Animal translate(final Animal animal) {
    return new Animal(translate(animal.points()));
  }

  /**
   * Rotate the given animal by 120 degrees on an anticlockwise direction.
   * @param animal animal to rotate
   * @return rotated animal
   */
  public static Animal rotate(final Animal animal) {
    final long[] rotatedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      rotatedPoints[k++] = rotate(point);
    }
    return new Animal(translate(rotatedPoints));
  }

  /**
   * Reflect the given animal in the vertical axis.
   * @param animal animal to reflect
   * @return reflected animal
   */
  public static Animal reflect(final Animal animal) {
    final long[] reflectedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = L.ordinate(point, 0);
      final long y = L.ordinate(point, 1);
      final long z = L.ordinate(point, 2);
      reflectedPoints[k++] = L.toPoint(-x, y, REFLECT_Z[(int) z]);
    }
    return new Animal(translate(reflectedPoints));
  }

  static Animal handleFullCell(final Animal animal) {
    // (x,y,1) & (x,y,5) -> (x,y,0) & (x,y,4)
    // (x,y,2) & (x,y,6) -> (x,y,0) & (x,y,4)
    // (x,y,3) & (x,y,7) -> (x,y,0) & (x,y,4)
    boolean needsFixing = false;
    final long[] pts = animal.points();
    for (final long pt : pts) {
      final long z = L.ordinate(pt, 2);
      if (z == 1 || z == 2 || z == 3) {
        final long x = L.ordinate(pt, 0);
        final long y = L.ordinate(pt, 1);
        final long c = L.toPoint(x, y, z + 4);
        if (animal.contains(c)) {
          needsFixing = true;
          break;
        }
      }
    }
    if (!needsFixing) {
      return animal;
    }

    final long[] newPts = Arrays.copyOf(pts, pts.length);
    for (int k = 0; k < newPts.length; ++k) {
      final long pt = newPts[k];
      final long z = L.ordinate(pt, 2);
      if (z == 1 || z == 2 || z == 3) {
        final long x = L.ordinate(pt, 0);
        final long y = L.ordinate(pt, 1);
        final long c = L.toPoint(x, y, z + 4);
        if (animal.contains(c)) {
          newPts[k] = L.toPoint(x, y, 0);
          for (int j = 0; j < newPts.length; ++j) {
            if (newPts[j] == c) {
              newPts[j] = L.toPoint(x, y, 4);
              break;
            }
          }
        }
      }
    }
    return new Animal(newPts);
  }

  /**
   * Test if the given animal is the canonical representation
   * @param animal the animal
   * @return true if is in canonical form
   */
  public static boolean isFreeCanonical(final Animal animal) {
    final Animal canon = handleFullCell(translate(animal));
    Animal b = canon;
    // Rotate by 90, 180, 270
    for (int k = 0; k < 3; ++k) {
      b = handleFullCell(rotate(b));
      if (canon.compareTo(b) > 0) {
        return false;
      }
    }
    b = handleFullCell(reflect(b));
    if (canon.compareTo(b) > 0) {
      return false;
    }
    // Rotate by 90, 180, 270
    for (int k = 0; k < 3; ++k) {
      b = handleFullCell(rotate(b));
      if (canon.compareTo(b) > 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Compute the canonical representation of an animal.
   * @param animal the animal
   * @return canonical form
   */
  public static Animal freeCanonical(final Animal animal) {
    Animal canon = handleFullCell(translate(animal));
    Animal b = canon;
    // Rotate by 90, 180, 270
    for (int k = 0; k < 3; ++k) {
      b = handleFullCell(rotate(b));
      if (canon.compareTo(b) > 0) {
        canon = b;
      }
    }
    b = handleFullCell(reflect(b));
    if (canon.compareTo(b) > 0) {
      canon = b;
    }
    // Rotate by 90, 180, 270
    for (int k = 0; k < 3; ++k) {
      b = handleFullCell(rotate(b));
      if (canon.compareTo(b) > 0) {
        canon = b;
      }
    }
    return canon;
  }
}
