package irvine.oeis.a000;

import java.util.Set;

import irvine.math.Polyomino;


/**
 * A000104 Number of n-celled polyominoes without holes.
 * @author Sean A. Irvine
 */
public class A000104 extends A000105 {

  @Override
  protected void filter(final Set<Polyomino> polyominoes) {
    polyominoes.removeIf(Polyomino::isHoly);
  }
}
