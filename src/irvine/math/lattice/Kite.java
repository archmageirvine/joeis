package irvine.math.lattice;

/**
 * Support functions for the kite lattice.
 * @author Sean A. Irvine
 */
public final class Kite {

  private Kite() {
  }

  private static final Lattice L = Lattices.KITE;
  private static final long[] ROTATE_Z = {5, 0, 1, 2, 3, 4};
  private static final long[] REFLECT_Z = {0, 5, 4, 3, 2, 1};

  /**
   * Rotate the given point by 60 degress anticlockwise.
   * @param point point to rotate
   * @return rotated point
   */
  public static long rotate(final long point) {
    final long x = L.ordinate(point, 0);
    final long y = L.ordinate(point, 1);
    final long z = L.ordinate(point, 2);
    return L.toPoint(-y, x + y, ROTATE_Z[(int) z]);
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
      reflectedPoints[k++] = L.toPoint(-(x + y), y, REFLECT_Z[(int) z]);
    }
    return new Animal(translate(reflectedPoints));
  }

  /**
   * Test if the given animal is the canonical representation
   * @param animal the animal
   * @return true if is in canonical form
   */
  public static boolean isFreeCanonical(final Animal animal) {
    final Animal canon = translate(animal);
    Animal b = canon;
    // Rotate by 60, 120, 180, 240, 300
    for (int k = 0; k < 5; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        return false;
      }
    }
    b = reflect(b);
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

  /**
   * Test if the given animal is the canonical representation
   * @param animal the animal
   * @return true if is in canonical form
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
    b = reflect(b);
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
}
