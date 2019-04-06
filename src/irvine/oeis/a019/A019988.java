package irvine.oeis.a019;

import java.util.TreeSet;

import irvine.oeis.a151.A151537;

/**
 * A019988 Number of ways of embedding a connected graph with n edges in the square lattice.
 * @author Sean A. Irvine
 */
public class A019988 extends A151537 {

  private int flip(final int v) {
    // (x,y) -> (y,x)
    return (v >>> Short.SIZE) + (v << Short.SIZE);
  }

  private long flip(final long edge) {
    return edge(flip((int) edge), flip((int) (edge >>> Integer.SIZE)));
  }

  private TreeSet<Long> flip(final TreeSet<Long> diagram) {
    final TreeSet<Long> flip = new TreeSet<>();
    for (final long edge : diagram) {
      flip.add(flip(edge));
    }
    return translate(flip);
  }

  @Override
  protected TreeSet<Long> canon(final TreeSet<Long> diagram) {
    final TreeSet<Long> t = super.canon(diagram);
    final TreeSet<Long> r = super.canon(flip(t));
    return compare(r, t) < 0 ? r : t;
  }
}
