package irvine.oeis.a001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A001931 Number of fixed 3-dimensional polycubes with n cells; lattice animals in the simple cubic lattice (6 nearest neighbors), face-connected cubes.
 * @author Sean A. Irvine
 */
public class A001931 implements Sequence {

  // Based on 2D version at https://rosettacode.org/wiki/Free_polyominoes_enumeration#Java
  // Not designed to be competitive with leading programs for this problem

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  protected static class Point extends Triple<Integer> {
    /**
     * Construct a point.
     * @param x x coordinate
     * @param y y coordinate
     * @param z z coordinate
     */
    public Point(final int x, final int y, final int z) {
      super(x, y, z);
    }
  }

  private static Point findMinima(final List<Point> poly) {
    return new Point(poly.stream().mapToInt(Point::left).min().getAsInt(),
      poly.stream().mapToInt(Point::mid).min().getAsInt(),
      poly.stream().mapToInt(Point::right).min().getAsInt());
  }

  private static List<Point> translateToOrigin(final List<Point> poly) {
    final Point min = findMinima(poly);
    poly.replaceAll(p -> new Point(p.left() - min.left(), p.mid() - min.mid(), p.right() - min.right()));
    return poly;
  }

  protected List<List<Point>> generateSymmetries(final List<Point> poly) {
    return Collections.singletonList(poly);
  }

  private static final Comparator<Point> BY_COORDS = Comparator.comparingInt(Point::left).thenComparingInt(Point::mid).thenComparingInt(Point::right);

  private List<Point> normalize(final List<Point> poly) {
    return generateSymmetries(poly).stream()
      .map(A001931::translateToOrigin)
      .map(lst -> lst.stream().sorted(BY_COORDS).collect(Collectors.toList()))
      .min(Comparator.comparing(Object::toString)) // not efficient but simple
      .get();
  }

  protected List<Point> neighborhoods(final Point p) {
    return Arrays.asList(new Point(p.left() - 1, p.mid(), p.right()),
      new Point(p.left() + 1, p.mid(), p.right()),
      new Point(p.left(), p.mid() - 1, p.right()),
      new Point(p.left(), p.mid() + 1, p.right()),
      new Point(p.left(), p.mid(), p.right() - 1),
      new Point(p.left(), p.mid(), p.right() + 1));
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

  protected List<List<Point>> mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Collections.singletonList(Collections.singletonList(new Point(0, 0, 0)));
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
