package irvine.oeis.a006;

import java.util.Set;

import irvine.math.Polyomino;
import irvine.oeis.a001.A001168;

/**
 * A006724 Number of fixed <code>n-celled self-avoiding</code> polygons on square lattice.
 * @author Sean A. Irvine
 */
public class A006724 extends A001168 {

  @Override
  protected void filter(final Set<Polyomino> polyominoes) {
    polyominoes.removeIf(Polyomino::isHoly);
  }
}
