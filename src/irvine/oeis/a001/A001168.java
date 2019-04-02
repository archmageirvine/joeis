package irvine.oeis.a001;

import irvine.math.Polyomino;
import irvine.oeis.a000.A000105;

/**
 * A001168 Number of fixed polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A001168 extends A000105 {

  @Override
  protected Polyomino canonicalize(final Polyomino polyomino) {
    return polyomino.translate();
  }

  {
    super.next();
  }
}
