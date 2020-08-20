package irvine.math.lattice;

/**
 * Pre-built canonicalization functions.
 * @author Sean A. Irvine
 */
public final class Canons {

  private Canons() { }

  public static final CanonChecker Z2_ONE_SIDED = new CanonChecker() {

    // todo this can be done generic on animal? -- might not be valid for every lattice
    public Animal translate(final Animal animal) {
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

    private Animal rotate90(final Animal animal, final long extentX) {
      final long[] rotatedPoints = new long[animal.size()];
      int k = 0;
      for (final long point : animal.points()) {
        final long x = Lattices.Z2.ordinate(point, 0);
        final long y = Lattices.Z2.ordinate(point, 1);
        rotatedPoints[k++] = Lattices.Z2.toPoint(y, extentX - x);
      }
      return new Animal(rotatedPoints);
    }

    private boolean isLt90(final Animal animal, final long extentX) {
      return animal.compareTo(rotate90(animal, extentX)) <= 0;
    }

    private Animal rotate180(final Animal animal, final long extentX, final long extentY) {
      final long[] rotatedPoints = new long[animal.size()];
      int k = 0;
      for (final long point : animal.points()) {
        final long x = Lattices.Z2.ordinate(point, 0);
        final long y = Lattices.Z2.ordinate(point, 1);
        rotatedPoints[k++] = Lattices.Z2.toPoint(extentX - x, extentY - y);
      }
      return new Animal(rotatedPoints);
    }

    private boolean isLt180(final Animal animal, final long extentX, final long extentY) {
      return animal.compareTo(rotate180(animal, extentX, extentY)) <= 0;
    }

    private Animal rotate270(final Animal animal, final long extentY) {
      final long[] rotatedPoints = new long[animal.size()];
      int k = 0;
      for (final long point : animal.points()) {
        final long x = Lattices.Z2.ordinate(point, 0);
        final long y = Lattices.Z2.ordinate(point, 1);
        rotatedPoints[k++] = Lattices.Z2.toPoint(extentY - y, x);
      }
      return new Animal(rotatedPoints);
    }

    private boolean isLt270(final Animal animal, final long extentY) {
      return animal.compareTo(rotate270(animal, extentY)) <= 0;
    }

    @Override
    public boolean isCanonical(final Animal a) {
      final Animal animal = translate(a);
      final long extentX = animal.extent(Lattices.Z2, 0);
      final long extentY = animal.extent(Lattices.Z2, 1);
      return isLt180(animal, extentX, extentY) && isLt90(animal, extentX) && isLt270(animal, extentY);
    }
  };
}
