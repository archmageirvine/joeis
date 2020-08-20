package irvine.math.lattice;

/**
 * Pre-built canonicalization functions.
 * @author Sean A. Irvine
 */
public final class Canons {

  private Canons() { }

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

  /** Check for a one-sided canonical animal on a square lattice. */
  public static final CanonChecker Z2_ONE_SIDED = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    return a.compareTo(rotate180(a, extentX, extentY)) <= 0
      && a.compareTo(rotate90(a, extentX)) <= 0
      && a.compareTo(rotate270(a, extentY)) <= 0;
  };

  /** Check for a free canonical animal on a square lattice. */
  public static final CanonChecker Z2_FREE = animal -> {
    // todo this is pretty ugly needs improvements
    if (!Z2_ONE_SIDED.isCanonical(animal)) {
      return false;
    }
    final Animal a = translate(animal);
    final Animal r45 = reflect45(a);
    if (a.compareTo(r45) > 0) {
      return false;
    }

    // todo if r45 == rh then skip the following

    long extentX = r45.extent(Lattices.Z2, 0);
    long extentY = r45.extent(Lattices.Z2, 1);
    if (a.compareTo(rotate90(r45, extentX)) > 0) {
      return false;
    }
    if (a.compareTo(rotate180(r45, extentX, extentY)) > 0) {
      return false;
    }
    if (a.compareTo(rotate270(r45, extentY)) > 0) {
      return false;
    }
    final Animal rh = reflectHorizontal(a, a.extent(Lattices.Z2, 0));
    if (a.compareTo(rh) > 0) {
      return false;
    }
    extentX = rh.extent(Lattices.Z2, 0);
    extentY = rh.extent(Lattices.Z2, 1);
    if (a.compareTo(rotate90(rh, extentX)) > 0) {
      return false;
    }
    if (a.compareTo(rotate180(rh, extentX, extentY)) > 0) {
      return false;
    }
    if (a.compareTo(rotate270(rh, extentY)) > 0) {
      return false;
    }
    // todo might need reflectV check
    return true;
  };

  /** Check for animals with no bilateral symmetry. */
  public static final CanonChecker Z2_NO_BILATERAL = animal -> {
    final Animal a = translate(animal);
    final long extentX = a.extent(Lattices.Z2, 0);
    final long extentY = a.extent(Lattices.Z2, 1);
    if (a.equals(reflectVertical(a, extentY))) {
      return false;
    }
    if (a.equals(reflectHorizontal(a, extentX))) {
      return false;
    }
    if (a.equals(reflect45(a))) {
      return false;
    }
    if (a.equals(reflect45(rotate180(a, extentX, extentY)))) {
      return false;
    }
    return true;
  };
}
