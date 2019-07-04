package irvine.oeis.a006;

import java.util.HashSet;

import irvine.math.Polyomino;
import irvine.oeis.a000.A000105;
import irvine.util.Point;

/**
 * A006770 Number of fixed n-celled polyominoes which need only touch at corners.
 * @author Sean A. Irvine
 */
public class A006770 extends A000105 {

  {
    super.next();
  }

  @Override
  protected Polyomino canonicalize(final Polyomino polyomino) {
    return polyomino.translate();
  }

  @Override
  protected void update(final HashSet<Polyomino> nextSet, final Polyomino p) {
    for (final Point cell : p) {
      final int left = cell.left();
      final int right = cell.right();
      addIfAbsent(nextSet, p, new Point(left - 1, right));
      addIfAbsent(nextSet, p, new Point(left + 1, right));
      addIfAbsent(nextSet, p, new Point(left, right - 1));
      addIfAbsent(nextSet, p, new Point(left, right + 1));
      addIfAbsent(nextSet, p, new Point(left - 1, right - 1));
      addIfAbsent(nextSet, p, new Point(left - 1, right + 1));
      addIfAbsent(nextSet, p, new Point(left + 1, right - 1));
      addIfAbsent(nextSet, p, new Point(left + 1, right + 1));
    }
  }
}
