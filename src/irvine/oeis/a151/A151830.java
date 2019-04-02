package irvine.oeis.a151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Quadruple;

/**
 * A151830 Number of fixed 4-dimensional polycubes with n cells.
 * @author Sean A. Irvine
 */
public class A151830 implements Sequence {

  // Based on 2D version at https://rosettacode.org/wiki/Free_polyominoes_enumeration#Java
  // Not designed to be competitive with leading programs for this problem
  // Cf. A0019131 (3D case)

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  protected static class Point extends Quadruple<Integer> {
    /**
     * Construct a point.
     * @param a first coordinate
     * @param b second coordinate
     * @param c third coordinate
     * @param d fourth coordinate
     */
    public Point(final int a, final int b, final int c, final int d) {
      super(a, b, c, d);
    }

    /**
     * Return the specified coordinate.
     * @param i coordinate number
     * @return coordinate value
     */
    public int o(final int i) {
      switch (i) {
        case 0:
          return a();
        case 1:
          return b();
        case 2:
          return c();
        default:
          return d();
      }
    }
  }

  private static Point findMinima(final List<Point> poly) {
    return new Point(poly.stream().mapToInt(Point::a).min().getAsInt(),
      poly.stream().mapToInt(Point::b).min().getAsInt(),
      poly.stream().mapToInt(Point::c).min().getAsInt(),
      poly.stream().mapToInt(Point::d).min().getAsInt());
  }

  private static List<Point> translateToOrigin(final List<Point> poly) {
    final Point min = findMinima(poly);
    poly.replaceAll(p -> new Point(p.a() - min.a(), p.b() - min.b(), p.c() - min.c(), p.d() - min.d()));
    return poly;
  }

  protected List<List<Point>> generateSymmetries(final List<Point> poly) {
    return Collections.singletonList(poly);
  }

  private static final Comparator<Point> BY_COORDS = Comparator.comparingInt(Point::a).thenComparingInt(Point::b).thenComparingInt(Point::c).thenComparing(Point::d);

  private List<Point> normalize(final List<Point> poly) {
    return generateSymmetries(poly).stream()
      .map(A151830::translateToOrigin)
      .map(lst -> lst.stream().sorted(BY_COORDS).collect(Collectors.toList()))
      .min(Comparator.comparing(Object::toString)) // not efficient but simple
      .get();
  }

  protected List<Point> neighborhoods(final Point p) {
    return Arrays.asList(new Point(p.a() - 1, p.b(), p.c(), p.d()),
      new Point(p.a() + 1, p.b(), p.c(), p.d()),
      new Point(p.a(), p.b() - 1, p.c(), p.d()),
      new Point(p.a(), p.b() + 1, p.c(), p.d()),
      new Point(p.a(), p.b(), p.c() - 1, p.d()),
      new Point(p.a(), p.b(), p.c() + 1, p.d()),
      new Point(p.a(), p.b(), p.c(), p.d() - 1),
      new Point(p.a(), p.b(), p.c(), p.d() + 1));
  }

  private static List<Point> concat(final List<Point> lst, final Point pt) {
    final List<Point> r = new ArrayList<>(lst);
    r.add(pt);
    return r;
  }

  private List<Point> newPoints(final List<Point> poly) {
    return poly.stream()
      .flatMap(p -> neighborhoods(p).stream())
      .filter(p -> !poly.contains(p))
      .distinct()
      .collect(Collectors.toList());
  }

  private List<List<Point>> constructNextRank(final List<Point> poly) {
    return newPoints(poly).stream()
      .map(p -> normalize(concat(poly, p)))
      .distinct()
      .collect(Collectors.toList());
  }

  private List<List<Point>> mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Collections.singletonList(Collections.singletonList(new Point(0, 0, 0, 0)));
    } else {
      mPrev = mPrev.stream()
        .parallel()
        .flatMap(lst -> constructNextRank(lst).stream())
        .distinct()
        .collect(Collectors.toList());
    }
    if (mVerbose) {
      System.out.println(mPrev);
    }
    return Z.valueOf(mPrev.size());
  }
}
