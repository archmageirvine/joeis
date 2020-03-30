package irvine.oeis.a030;

import java.util.HashSet;

import irvine.math.Polyomino;
import irvine.math.z.Z;

/**
 * A030234 Number of n-celled polyplets having bilateral symmetry.
 * @author Sean A. Irvine
 */
public class A030234 extends A030222 {

  @Override
  protected Z count(final HashSet<Polyomino> a) {
    int c = 0;
    for (final Polyomino p : a) {
      if (p.reflectVertical().translate().equals(p)
        || p.reflectHorizontal().translate().equals(p)
        || p.swap().translate().equals(p)
        || p.rotate180().swap().translate().equals(p)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
