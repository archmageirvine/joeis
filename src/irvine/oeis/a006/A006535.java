package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import irvine.oeis.a001.A001931;

/**
 * A006535 Number of one-sided hexagonal polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006535 extends A001931 {

  @Override
  protected List<Point> neighborhoods(final Point p) {
    return Arrays.asList(new A001931.Point(p.left() + 1, p.mid() - 1, p.right()),
      new A001931.Point(p.left() + 1, p.mid(), p.right() - 1),
      new A001931.Point(p.left(), p.mid() + 1, p.right() - 1),
      new A001931.Point(p.left() - 1, p.mid() + 1, p.right()),
      new A001931.Point(p.left() - 1, p.mid(), p.right() + 1),
      new A001931.Point(p.left(), p.mid() - 1, p.right() + 1));
  }

  private static final List<Function<Point, Point>> TRANSFORMS = new ArrayList<>();
  static {
    // Rotation 60
    TRANSFORMS.add(p -> new Point(-p.mid(), -p.right(), -p.left()));
    // Rotation -60
    TRANSFORMS.add(p -> new Point(-p.right(), -p.left(), -p.mid()));
    // Rotation 120
    TRANSFORMS.add(p -> new Point(p.right(), p.left(), p.mid()));
    // Rotation -120
    TRANSFORMS.add(p -> new Point(p.mid(), p.right(), p.left()));
    // Rotation 180
    TRANSFORMS.add(p -> new Point(-p.left(), -p.mid(), -p.right()));
  }

  @Override
  protected List<List<Point>> generateSymmetries(final List<Point> poly) {
    final List<List<Point>> lst = new ArrayList<>(TRANSFORMS.size());
    lst.add(poly);
    for (final Function<Point, Point> t : TRANSFORMS) {
      lst.add(poly.stream().map(t).collect(Collectors.toList()));
    }
    return lst;
  }
}
