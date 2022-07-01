package irvine.math.lattice;

/**
 * Support functions for the hexagonal lattice.
 * @author Sean A. Irvine
 */
public final class Hexagonal {

  private Hexagonal() {
  }

  private static final Lattice H = Lattices.HEXAGONAL;

  /**
   * Rotate the given point by 60 degress anticlockwise.
   * @param point point to rotate
   * @return rotated point
   */
  public static long rotate(final long point) {
    final long x = H.ordinate(point, 0);
    final long y = H.ordinate(point, 1);
    return H.toPoint((x - 3 * y) / 2, (x + y) / 2);
  }

  /**
   * Translate points to a canonical position on the hexagonal lattice.
   * @param points points to translate
   * @return translated points
   */
  private static long[] translate(final long[] points) {
    long minX = Long.MAX_VALUE;
    long minY = Long.MAX_VALUE;
    for (final long p : points) {
      final long x = H.ordinate(p, 0);
      if (x < minX) {
        minX = x;
      }
      final long y = H.ordinate(p, 1);
      if (y < minY) {
        minY = y;
      }
    }
    if (minX == 0 && minY == 0) {
      return points; // already in canonical position
    }
    final long[] translate = new long[points.length];
    int k = 0;
    final long bit = (minX + minY) & 1;
    final long dx = minX - bit;
    final long dy = minY;
    for (final long point : points) {
      final long x = H.ordinate(point, 0);
      final long y = H.ordinate(point, 1);
      translate[k++] = H.toPoint(x - dx, y - dy);
    }
    return translate;
  }

  /**
   * Translate an animal to a canonical position on the hexagonal lattice.
   * @param animal animal to translate
   * @return translated animal
   */
  public static Animal translate(final Animal animal) {
    return new Animal(translate(animal.points()));
  }

  /**
   * Rotate the given animal by 60 degrees on an anticlockwise direction.
   * @param animal animal to rotate
   * @return rotated animal
   */
  public static Animal rotate(final Animal animal) {
    final long[] rotatedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      rotatedPoints[k++] = Hexagonal.rotate(point);
    }
    return new Animal(translate(rotatedPoints));
  }

  /**
   * Reflect the given animal in the horizontal axis.
   * @param animal animal to reflect
   * @return reflected animal
   */
  public static Animal reflect(final Animal animal) {
    final long[] reflectedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = H.ordinate(point, 0);
      final long y = H.ordinate(point, 1);
      reflectedPoints[k++] = H.toPoint(x, -y);
    }
    return new Animal(translate(reflectedPoints));
  }

  /**
   * Return the free canonical form of the given animal.
   * @param animal the animal
   * @return canonical form
   */
  public static Animal freeCanonical(final Animal animal) {
    Animal canon = translate(animal);
    Animal b = canon;
    // Rotate by 60, 120, 180, 240, 300
    for (int k = 0; k < 5; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        canon = b;
      }
    }
    b = Hexagonal.reflect(b);
    if (canon.compareTo(b) > 0) {
      canon = b;
    }
    // Rotate by 60, 120, 180, 240, 300
    for (int k = 0; k < 5; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        canon = b;
      }
    }
    return canon;
  }

  /**
   * Test if the given animal is the canonical representation
   * @param animal the animal
   * @return true if is in canonical form
   */
  public static boolean isFreeCanonical(final Animal animal) {
    Animal canon = translate(animal);
    Animal b = canon;
    // Rotate by 60, 120, 180, 240, 300
    for (int k = 0; k < 5; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        return false;
      }
    }
    b = Hexagonal.reflect(b);
    if (canon.compareTo(b) > 0) {
      return false;
    }
    // Rotate by 60, 120, 180, 240, 300
    for (int k = 0; k < 5; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        return false;
      }
    }
    return true;
  }
}
