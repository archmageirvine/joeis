package irvine.math.lattice;

/**
 * Canonicalization for polybricks.
 * @author Sean A. Irvine
 */
public final class Polybrick {

  private Polybrick() {
  }

  private static final SquareLattice L = new SquareLattice();

  private static String toTikz(final long x, final long y, final String modifier) {
    return "\\draw" + modifier + " (" + x + "," + y + ") -- (" + (x + 1) + "," + y + ") -- (" + (x + 1) + "," + (y + 1) + ") -- (" + x + "," + (y + 1) + ") -- cycle;";
  }

  /**
   * Represent the animal as a Tikz string.
   * @param animal the animal
   * @return Tik string.
   */
  public static String toTikz(final Animal animal) {
    final StringBuilder sb = new StringBuilder();
    sb.append("\\arabic{cnt}.\\addtocounter{cnt}{1}\\begin{tikzpicture}[scale=0.25]\n");
    for (final long point : animal.points()) {
      final long x = L.x(point);
      final long y = L.y(point);
      sb.append(toTikz(x, y, "[fill=lightgray]")).append('\n');
      sb.append(toTikz(x, y, "")).append('\n');
    }
    sb.append("\\end{tikzpicture}");
    return sb.toString();
  }

  private static long[] translate(final long[] points) {
    // There a tricky even/odd thing on each row to account for
    long minX = Long.MAX_VALUE;
    long minY = Long.MAX_VALUE;
    long minXAtMinY = 0;
    for (final long p : points) {
      final long x = L.x(p);
      final long y = L.y(p);
      if (x < minX) {
        minX = x;
      }
      if (y <= minY) {
        if (y < minY) {
          minY = y;
          minXAtMinY = x;
        } else if (x < minXAtMinY) {
          minXAtMinY = x;
        }
      }
    }
    if (minX == 0 && minY == 0) {
      return points;
    }
    minX -= (minX + minXAtMinY) & 1;
    final int bitsPerCoordinate = L.bitsPerCoordinate();
    final long delta = (minY << bitsPerCoordinate) + minX;
    final long[] translate = new long[points.length];
    int k = 0;
    for (final long p : points) {
      translate[k++] = p - delta;
    }
    return translate;
  }

  /**
   * Translate an animal to the origin with respect to a lattice.
   * @param animal animal to translate
   * @return translated animal
   */
  public static Animal translate(final Animal animal) {
    return new Animal(translate(animal.points()));
  }

  private static Animal reflectHorizontal(final Animal animal) {
    final long[] reflectedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = L.x(point);
      final long y = L.y(point);
      reflectedPoints[k++] = L.toPoint(-x, y);
    }
    return new Animal(translate(reflectedPoints));
  }

  private static Animal reflectVertical(final Animal animal) {
    final long[] reflectedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = L.x(point);
      final long y = L.y(point);
      reflectedPoints[k++] = L.toPoint(x, -y);
    }
    return new Animal(translate(reflectedPoints));
  }

  /**
   * Return the canonical form of the given animal.
   * @param animal polybrick to get canonical form of
   */
  public static Animal freeCanonical(final Animal animal) {
    final Animal a = translate(animal);
    Animal canon = a;
    final Animal reflect = reflectHorizontal(a);
    if (reflect.compareTo(canon) < 0) {
      canon = reflect;
    }
    final Animal vertical = reflectVertical(a);
    if (vertical.compareTo(canon) < 0) {
      canon = vertical;
    }
    final Animal r2 = reflectHorizontal(vertical);
    if (r2.compareTo(canon) < 0) {
      canon = r2;
    }
    return canon;
  }
}
