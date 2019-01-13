package irvine.oeis.a001;

import java.util.Arrays;
import java.util.List;

/**
 * A001207.
 * @author Sean A. Irvine
 */
public class A001207 extends A001931 {

  // See cubic coordinates described at
  // http://www.redblobgames.com/grids/hexagons

  @Override
  protected List<Point> neighborhoods(final Point p) {
    return Arrays.asList(new Point(p.left() + 1, p.mid() - 1, p.right()),
      new Point(p.left() + 1, p.mid(), p.right() - 1),
      new Point(p.left(), p.mid() + 1, p.right() - 1),
      new Point(p.left() - 1, p.mid() + 1, p.right()),
      new Point(p.left() - 1, p.mid(), p.right() + 1),
      new Point(p.left(), p.mid() - 1, p.right() + 1));
  }
}
