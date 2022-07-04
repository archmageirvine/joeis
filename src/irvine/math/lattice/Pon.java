package irvine.math.lattice;

/**
 * Support functions for the pon lattice.
 * @author Sean A. Irvine
 */
public final class Pon {

  private Pon() {
  }

  private static final Lattice L = Lattices.PON;
  private static final long[] ROTATE_Z = {2, 0, 1, 5, 3, 4};
  private static final long[] REFLECT_Z = {0, 2, 1, 3, 5, 4};

  /**
   * Rotate the given point by 120 degress anticlockwise.
   * @param point point to rotate
   * @return rotated point
   */
  public static long rotate(final long point) {
    final long x = L.ordinate(point, 0);
    final long y = L.ordinate(point, 1);
    final long z = L.ordinate(point, 2);
    return L.toPoint(-y - x, x, ROTATE_Z[(int) z]);
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
   * Reflect the given animal in the horizontal axis.
   * @param animal animal to reflect
   * @return reflected animal
   */
  public static Animal glideReflect(final Animal animal) {
    final long[] reflectedPoints = new long[animal.size()];
    int k = 0;
    for (final long point : animal.points()) {
      final long x = L.ordinate(point, 0);
      final long y = L.ordinate(point, 1);
      final long z = L.ordinate(point, 2);
      switch ((int) z) {
        case 0:
          reflectedPoints[k++] = L.toPoint(x + y, -y, 3);
          break;
        case 3:
          reflectedPoints[k++] = L.toPoint(x + y, -y, 0);
          break;
        case 1:
          reflectedPoints[k++] = L.toPoint(x + y, -y - 1, 5);
          break;
        case 5:
          reflectedPoints[k++] = L.toPoint(x + y + 1, -1 - y, 1);
          break;
        case 2:
          reflectedPoints[k++] = L.toPoint(x + y + 1, -1 - y, 4);
          break;
        case 4:
          reflectedPoints[k++] = L.toPoint(x + y, -1 - y, 2);
          break;
        default:
          throw new RuntimeException();
      }
    }
    return new Animal(translate(reflectedPoints));
  }


  private static String toTikz(final long x, final long y, final long z, final String modifier) {
    final long cx = 2 * x + y;
    final float cy = 1.5F * y;
    switch ((int) z) {
      case 0:
        return "\\draw" + modifier + " (" + (cx - 1) + "," + (cy - 0.5) + ") -- (" + (cx + 1) + "," + (cy - 0.5) + ") -- (" + cx + "," + cy + ") -- cycle;";
      case 1:
        return "\\draw" + modifier + " (" + (cx - 1) + "," + (cy - 0.5) + ") -- (" + cx + "," + (cy + 1) + ") -- (" + cx + "," + cy + ") -- cycle;";
      case 2:
        return "\\draw" + modifier + " (" + (cx + 1) + "," + (cy - 0.5) + ") -- (" + cx + "," + (cy + 1) + ") -- (" + cx + "," + cy + ") -- cycle;";
      case 3:
        return "\\draw" + modifier + " (" + (cx - 1) + "," + (cy - 0.5) + ") -- (" + (cx + 1) + "," + (cy - 0.5) + ") -- (" + cx + "," + (cy - 1) + ") -- cycle;";
      case 4:
        return "\\draw" + modifier + " (" + (cx - 1) + "," + (cy - 0.5) + ") -- (" + cx + "," + (cy + 1) + ") -- (" + (cx - 1) + "," + (cy + 0.5) + ") -- cycle;";
      case 5:
        return "\\draw" + modifier + " (" + (cx + 1) + "," + (cy - 0.5) + ") -- (" + cx + "," + (cy + 1) + ") -- (" + (cx + 1) + "," + (cy + 0.5) + ") -- cycle;";
      default:
        throw new UnsupportedOperationException();
    }
  }

  /**
   * Represent the animal as a Tikz string.
   * @param animal the animal
   * @return Tik string.
   */
  public static String toTikz(final Animal animal) {
    final StringBuilder sb = new StringBuilder();
    sb.append("\\begin{tikzpicture}\n");
    for (final long point : animal.points()) {
      final long x = L.ordinate(point, 0);
      final long y = L.ordinate(point, 1);
      final long z = L.ordinate(point, 2);
      sb.append(toTikz(x, y, z, "[fill=lightgray]")).append('\n');
      sb.append(toTikz(x, y, z, "")).append('\n');
    }
    sb.append("\\end{tikzpicture}\n");
    return sb.toString();
  }

  /**
   * Test if the given animal is the canonical representation
   * @param animal the animal
   * @return true if is in canonical form
   */
  public static boolean isFreeCanonical(final Animal animal) {
    final Animal canon = translate(animal);
    Animal b = canon;
    // Rotate by 120, 240
    for (int k = 0; k < 2; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        return false;
      }
    }
    b = Pon.reflect(b);
    if (canon.compareTo(b) > 0) {
      return false;
    }
    // Rotate by 120, 240
    for (int k = 0; k < 2; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        return false;
      }
    }
    b = Pon.glideReflect(b);
    if (canon.compareTo(b) > 0) {
      return false;
    }
    // Rotate by 120, 240
    for (int k = 0; k < 2; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        return false;
      }
    }
    b = Pon.reflect(b);
    if (canon.compareTo(b) > 0) {
      return false;
    }
    // Rotate by 120, 240
    for (int k = 0; k < 2; ++k) {
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
    // Rotate by 120, 240
    for (int k = 0; k < 2; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        canon = b;
      }
    }
    b = reflect(b);
    if (canon.compareTo(b) > 0) {
      canon = b;
    }
    // Rotate by 120, 240
    for (int k = 0; k < 2; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        canon = b;
      }
    }
    b = glideReflect(b);
    if (canon.compareTo(b) > 0) {
      canon = b;
    }
    // Rotate by 120, 240
    for (int k = 0; k < 2; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        canon = b;
      }
    }
    b = reflect(b);
    if (canon.compareTo(b) > 0) {
      canon = b;
    }
    // Rotate by 120, 240
    for (int k = 0; k < 2; ++k) {
      b = rotate(b);
      if (canon.compareTo(b) > 0) {
        canon = b;
      }
    }
    return canon;
  }
}
