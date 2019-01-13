package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import irvine.oeis.a001.A001207;

/**
 * A000228.
 * @author Sean A. Irvine
 */
public class A000228 extends A001207 {

  private static final List<Function<A001207.Point, A001207.Point>> TRANSFORMS = new ArrayList<>();
  static {
    // Rotation 60
    TRANSFORMS.add(p -> new A001207.Point(-p.mid(), -p.right(), -p.left()));
    // Rotation -60
    TRANSFORMS.add(p -> new A001207.Point(-p.right(), -p.left(), -p.mid()));
    // Rotation 120
    TRANSFORMS.add(p -> new A001207.Point(p.right(), p.left(), p.mid()));
    // Rotation -120
    TRANSFORMS.add(p -> new A001207.Point(p.mid(), p.right(), p.left()));
    // Rotation 180
    TRANSFORMS.add(p -> new A001207.Point(-p.left(), -p.mid(), -p.right()));

    // Reflection
    TRANSFORMS.add(p -> new A001207.Point(-p.mid(), -p.left(), -p.right()));
    // Reflection then rotation
    TRANSFORMS.add(p -> new A001207.Point(p.left(), p.right(), p.mid()));
    TRANSFORMS.add(p -> new A001207.Point(-p.right(), -p.mid(), -p.left()));
    TRANSFORMS.add(p -> new A001207.Point(p.mid(), p.left(), p.right()));
    TRANSFORMS.add(p -> new A001207.Point(-p.left(), -p.right(), -p.mid()));
    TRANSFORMS.add(p -> new A001207.Point(p.right(), p.mid(), p.left()));
    TRANSFORMS.add(p -> new A001207.Point(-p.mid(), -p.left(), -p.right()));
  }

  @Override
  protected List<List<A001207.Point>> generateSymmetries(final List<A001207.Point> poly) {
    final List<List<A001207.Point>> lst = new ArrayList<>(TRANSFORMS.size());
    lst.add(poly);
    for (final Function<A001207.Point, A001207.Point> t : TRANSFORMS) {
      lst.add(poly.stream().map(t).collect(Collectors.toList()));
    }
    return lst;
  }
}
