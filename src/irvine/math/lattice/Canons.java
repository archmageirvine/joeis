package irvine.math.lattice;

/**
 * Pre-built canonicalization functions.
 * @author Sean A. Irvine
 */
public final class Canons {

  private Canons() {
  }

  // todo this can be done generic on animal? -- might not be valid for every lattice
  // todo better home for these methods
  private static Animal translate(final Animal animal) {
    long minX = Integer.MAX_VALUE;
    long minY = Integer.MAX_VALUE;
    for (final long point : animal.points()) {
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      minX = Math.min(minX, x);
      minY = Math.min(minY, y);
    }
    if (minX == 0 && minY == 0) {
      return animal;
    }
    final long[] translate = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      translate[k++] = Lattices.Z2.toPoint(x - minX, y - minY);
    }
    return new Animal(translate);
  }

  private static Animal rotate90(final Animal animal, final long extentX) {
    final long[] rotatedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      rotatedPoints[k++] = Lattices.Z2.toPoint(y, extentX - x);
    }
    return new Animal(rotatedPoints);
  }

  private static Animal rotate180(final Animal animal, final long extentX, final long extentY) {
    final long[] rotatedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      rotatedPoints[k++] = Lattices.Z2.toPoint(extentX - x, extentY - y);
    }
    return new Animal(rotatedPoints);
  }

  private static Animal rotate270(final Animal animal, final long extentY) {
    final long[] rotatedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      rotatedPoints[k++] = Lattices.Z2.toPoint(extentY - y, x);
    }
    return new Animal(rotatedPoints);
  }

  private static Animal reflect45(final Animal animal) {
    final long[] reflectedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      reflectedPoints[k++] = Lattices.Z2.toPoint(y, x);
    }
    return new Animal(reflectedPoints);
  }

  private static Animal reflectHorizontal(final Animal animal, final long extentX) {
    final long[] reflectedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      reflectedPoints[k++] = Lattices.Z2.toPoint(extentX - x, y);
    }
    return new Animal(reflectedPoints);
  }

  private static Animal reflectVertical(final Animal animal, final long extentY) {
    final long[] reflectedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      reflectedPoints[k++] = Lattices.Z2.toPoint(x, extentY - y);
    }
    return new Animal(reflectedPoints);
  }

  /**
   * Check for a one-sided canonical animal on a square lattice.
   */
  public static final CanonChecker Z2_ONE_SIDED = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    return a.compareTo(rotate180(a, extentX, extentY)) <= 0
      && a.compareTo(rotate90(a, extentX)) <= 0
      && a.compareTo(rotate270(a, extentY)) <= 0;
  };

  /**
   * Check for a free canonical animal on a square lattice.
   */
  public static final CanonChecker Z2_FREE = animal -> {
    // todo this is pretty ugly needs improvements
    if (!Z2_ONE_SIDED.isCanonical(animal)) {
      return false;
    }
    final Animal a = translate(animal);
    final Animal r45 = reflect45(a);
    final int c0 = a.compareTo(r45);
    if (c0 > 0) {
      return false;
    } else if (c0 != 0) {
      final long extentX = r45.extent(Lattices.Z2, 0);
      final long extentY = r45.extent(Lattices.Z2, 1);
      if (a.compareTo(rotate90(r45, extentX)) > 0) {
        return false;
      }
      if (a.compareTo(rotate180(r45, extentX, extentY)) > 0) {
        return false;
      }
      if (a.compareTo(rotate270(r45, extentY)) > 0) {
        return false;
      }
    }
    return true;
  };

  /**
   * Check for animals with bilateral symmetry.
   */
  public static final CanonChecker Z2_BILATERAL = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    return a.equals(reflectVertical(a, extentY))
      || a.equals(reflectHorizontal(a, extentX))
      || a.equals(reflect45(a))
      || a.equals(reflect45(rotate180(a, extentX, extentY)));
  };

  /**
   * Check for a two-sided rectangle.
   */
  public static final CanonChecker Z2_TWO_SIDED_RECTABLE = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    return a.compareTo(rotate180(a, extentX, extentY)) <= 0
      && a.compareTo(reflectHorizontal(a, extentX)) <= 0
      && a.compareTo(reflectVertical(a, extentY)) <= 0;
  };

  /**
   * Check for C<sub>2</sub> symmetry.
   */
  public static final CanonChecker Z2_C2 = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    final Animal r180 = rotate180(a, extentX, extentY);
    return a.equals(r180)
      && !a.equals(reflectHorizontal(a, extentX))
      && !a.equals(reflectVertical(a, extentY))
      && !a.equals(reflect45(a))
      && !a.equals(reflect45(r180))
      && !a.equals(rotate90(a, extentX))
      && !a.equals(rotate270(a, extentY));
  };

  /**
   * Check for mirror 90 degrees symmetry.
   */
  public static final CanonChecker Z2_AXIALLY_SYMMETRIC = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    if (a.equals(reflectHorizontal(a, extentX)) ^ a.equals(reflectVertical(a, extentY))) {
      final Animal r180 = rotate180(a, extentX, extentY);
      return !a.equals(r180)
        && !a.equals(reflect45(a))
        && !a.equals(reflect45(r180))
        && !a.equals(rotate90(a, extentX))
        && !a.equals(rotate270(a, extentY));
    }
    return false;
  };

  /**
   * Check for mirror 45 degrees symmetry.
   */
  public static final CanonChecker Z2_DIAGONALLY_SYMMETRIC = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    final Animal r180 = rotate180(a, extentX, extentY);
    return !a.equals(r180)
      && (a.equals(reflect45(a)) || a.equals(reflect45(r180)))
      && !a.equals(reflectHorizontal(a, extentX))
      && !a.equals(reflectVertical(a, extentY))
      && !a.equals(rotate90(a, extentX))
      && !a.equals(rotate270(a, extentY));
  };

  /**
   * Check for asymmetry.
   */
  public static final CanonChecker Z2_ASYMMETRIC = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    final Animal r180 = rotate180(a, extentX, extentY);
    return !a.equals(r180)
      && !a.equals(reflect45(r180))
      && !a.equals(reflect45(a))
      && !a.equals(reflectHorizontal(a, extentX))
      && !a.equals(reflectVertical(a, extentY))
      && !a.equals(rotate90(a, extentX))
      && !a.equals(rotate270(a, extentY));
  };

  /**
   * Return the canonical form of the given animal.
   */
  public static Animal freeCanon(final Animal animal) {
    final Animal a = translate(animal);
    Animal canon = a;
    long extentX = a.extent(Lattices.Z2, 0);
    long extentY = a.extent(Lattices.Z2, 1);
    final Animal r180 = rotate180(a, extentX, extentY);
    if (r180.compareTo(canon) < 0) {
      canon = r180;
    }
    final Animal r90 = rotate90(a, extentX);
    if (r90.compareTo(canon) < 0) {
      canon = r90;
    }
    final Animal r270 = rotate270(a, extentY);
    if (r270.compareTo(canon) < 0) {
      canon = r270;
    }
    final Animal r45 = reflect45(a);
    if (r45.compareTo(canon) < 0) {
      canon = r45;
    }
    extentX = r45.extent(Lattices.Z2, 0);
    extentY = r45.extent(Lattices.Z2, 1);
    final Animal r45r90 = rotate90(r45, extentX);
    if (r45r90.compareTo(canon) < 0) {
      canon = r45r90;
    }
    final Animal r45r180 = rotate180(r45, extentX, extentY);
    if (r45r180.compareTo(canon) < 0) {
      canon = r45r180;
    }
    final Animal r45r270 = rotate270(r45, extentY);
    if (r45r270.compareTo(canon) < 0) {
      canon = r45r270;
    }
    return canon;
  }
}
