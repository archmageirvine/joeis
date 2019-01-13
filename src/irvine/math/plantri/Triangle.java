package irvine.math.plantri;

/**
 * Hold the edges of a triangle.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Triangle {

  Edge mEdge1 = null;
  Edge mEdge2 = null;
  Edge mEdge3 = null;

  static Triangle[] create(final int size) {
    final Triangle[] res = new Triangle[size];
    for (int k = 0; k < size; ++k) {
      res[k] = new Triangle();
    }
    return res;
  }
}
