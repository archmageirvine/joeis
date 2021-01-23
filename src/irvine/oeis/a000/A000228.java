package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import irvine.oeis.a001.A001931;

/**
 * A000228 Number of hexagonal polyominoes (or hexagonal polyforms, or planar polyhexes) with n cells.
 * @author Sean A. Irvine
 */
public class A000228 extends A001931 {

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

  private static final List<Function<A001931.Point, A001931.Point>> TRANSFORMS = new ArrayList<>();
  static {
    // Rotation 60
    TRANSFORMS.add(p -> new A001931.Point(-p.mid(), -p.right(), -p.left()));
    // Rotation -60
    TRANSFORMS.add(p -> new A001931.Point(-p.right(), -p.left(), -p.mid()));
    // Rotation 120
    TRANSFORMS.add(p -> new A001931.Point(p.right(), p.left(), p.mid()));
    // Rotation -120
    TRANSFORMS.add(p -> new A001931.Point(p.mid(), p.right(), p.left()));
    // Rotation 180
    TRANSFORMS.add(p -> new A001931.Point(-p.left(), -p.mid(), -p.right()));

    // Reflection
    TRANSFORMS.add(p -> new A001931.Point(-p.mid(), -p.left(), -p.right()));
    // Reflection then rotation
    TRANSFORMS.add(p -> new A001931.Point(p.left(), p.right(), p.mid()));
    TRANSFORMS.add(p -> new A001931.Point(-p.right(), -p.mid(), -p.left()));
    TRANSFORMS.add(p -> new A001931.Point(p.mid(), p.left(), p.right()));
    TRANSFORMS.add(p -> new A001931.Point(-p.left(), -p.right(), -p.mid()));
    TRANSFORMS.add(p -> new A001931.Point(p.right(), p.mid(), p.left()));
    TRANSFORMS.add(p -> new A001931.Point(-p.mid(), -p.left(), -p.right()));
  }

  @Override
  protected List<List<A001931.Point>> generateSymmetries(final List<A001931.Point> poly) {
    final List<List<A001931.Point>> lst = new ArrayList<>(TRANSFORMS.size());
    lst.add(poly);
    for (final Function<A001931.Point, A001931.Point> t : TRANSFORMS) {
      lst.add(poly.stream().map(t).collect(Collectors.toList()));
    }
    return lst;
  }
}
