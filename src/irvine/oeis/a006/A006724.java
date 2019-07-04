package irvine.oeis.a006;

import java.util.Set;

import irvine.math.Polyomino;
import irvine.oeis.a000.A000105;

/**
 * A006724 Number of fixed <code>n-celled self-avoiding</code> polygons on square lattice.
 * @author Sean A. Irvine
 */
public class A006724 extends A000105 {

  {
    super.next();
  }

  @Override
  protected Polyomino canonicalize(final Polyomino polyomino) {
    return polyomino.translate();
  }

  @Override
  protected void filter(final Set<Polyomino> polyominoes) {
    polyominoes.removeIf(Polyomino::isHoly);
  }
}
