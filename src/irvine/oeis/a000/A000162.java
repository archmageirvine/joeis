package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import irvine.oeis.a001.A001931;

/**
 * A000162 Number of 3-dimensional polyominoes <code>(or polycubes)</code> with n cells.
 * @author Sean A. Irvine
 */
public class A000162 extends A001931 {

  // Nice example of these rotations at
  // http://www.euclideanspace.com/maths/algebra/matrix/transforms/examples/index.htm

  private static final List<Function<Point, Point>> TRANSFORMS = new ArrayList<>();
  static {
    TRANSFORMS.add(p -> new Point(p.left(), p.mid(), p.right()));
    TRANSFORMS.add(p -> new Point(p.left(), -p.right(), p.mid()));
    TRANSFORMS.add(p -> new Point(p.left(), -p.mid(), -p.right()));
    TRANSFORMS.add(p -> new Point(p.left(), p.right(), -p.mid()));
    TRANSFORMS.add(p -> new Point(-p.mid(), p.left(), p.right()));
    TRANSFORMS.add(p -> new Point(p.right(), p.left(), p.mid()));
    TRANSFORMS.add(p -> new Point(p.mid(), p.left(), -p.right()));
    TRANSFORMS.add(p -> new Point(-p.right(), p.left(), -p.mid()));
    TRANSFORMS.add(p -> new Point(-p.left(), -p.mid(), p.right()));
    TRANSFORMS.add(p -> new Point(-p.left(), -p.right(), -p.mid()));
    TRANSFORMS.add(p -> new Point(-p.left(), p.mid(), -p.right()));
    TRANSFORMS.add(p -> new Point(-p.left(), p.right(), p.mid()));
    TRANSFORMS.add(p -> new Point(p.mid(), -p.left(), p.right()));
    TRANSFORMS.add(p -> new Point(p.right(), -p.left(), -p.mid()));
    TRANSFORMS.add(p -> new Point(-p.mid(), -p.left(), -p.right()));
    TRANSFORMS.add(p -> new Point(-p.right(), -p.left(), p.mid()));
    TRANSFORMS.add(p -> new Point(-p.right(), p.mid(), p.left()));
    TRANSFORMS.add(p -> new Point(p.mid(), p.right(), p.left()));
    TRANSFORMS.add(p -> new Point(p.right(), -p.mid(), p.left()));
    TRANSFORMS.add(p -> new Point(-p.mid(), -p.right(), p.left()));
    TRANSFORMS.add(p -> new Point(-p.right(), -p.mid(), -p.left()));
    TRANSFORMS.add(p -> new Point(-p.mid(), p.right(), -p.left()));
    TRANSFORMS.add(p -> new Point(p.right(), p.mid(), -p.left()));
    TRANSFORMS.add(p -> new Point(p.mid(), -p.right(), -p.left()));
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
