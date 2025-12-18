package irvine.oeis.a389;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A389392 a(n) is the number of 4 element sets of distinct integer sided trapezoids whose base angles are 60 degrees that fill an equilateral triangular grid of side n units.
 * @author Sean A. Irvine
 */
public class A389392 extends Sequence1 {

  // After Janaka Rodrigo

  // Compute area of polygon from lattice coordinates
  private static int areaInUnits(final List<Point> poly) {
    int s = 0;
    final int n = poly.size();
    for (int i = 0; i < n; ++i) {
      final Point p = poly.get(i);
      final Point q = poly.get((i + 1) % n);
      s += p.left() * q.right() - q.left() * p.right();
    }
    return Math.abs(s);
  }

  /*
   * Return the three trapezoids (PFAD, PDBE, PECF) as lists of points.
   */
  private static List<List<Point>> threeTrapezoidPolygons(final int side, final int h, final int k) {
    final Point p = new Point(h, k);
    final Point d = new Point(h, 0);
    final Point b = new Point(side, 0);
    final Point e = new Point(side - k, k);
    final Point c = new Point(0, side);
    final Point f = new Point(0, h + k);
    final Point a = new Point(0, 0);
    final List<Point> polyB = Arrays.asList(p, d, b, e);
    final List<Point> polyC = Arrays.asList(p, e, c, f);
    final List<Point> polyA = Arrays.asList(p, f, a, d);
    return Arrays.asList(polyA, polyB, polyC);
  }

  /*
   * Compute distinct 3-trapezoid partitions for triangle of side p.
   */
  private static Set<TreeSet<Point>> triples(final int p) {
    final Set<TreeSet<Point>> triples = new HashSet<>();
    for (int h = 1; h < p; ++h) {
      for (int k = 1; k < p - h; ++k) {
        final List<List<Point>> polys = threeTrapezoidPolygons(p, h, k);
        final TreeSet<Point> shapes = new TreeSet<>();
        shapes.add(new Point(areaInUnits(polys.get(0)), h));
        shapes.add(new Point(areaInUnits(polys.get(1)), k));
        shapes.add(new Point(areaInUnits(polys.get(2)), p - h - k));
        if (shapes.size() < 3) {
          continue; // Not all shapes were distinct
        }
        triples.add(shapes);
      }
    }
    return triples;
  }

  private static boolean isOk(final Collection<Point> trip, final int remArea, final int rRows) {
    for (final Point s : trip) {
      if (s.left() == remArea && s.right() == rRows) {
        return false;
      }
    }
    return true;
  }

  private static Set<String> generateCategoryA(final int n) {
    final Map<Integer, Set<TreeSet<Point>>> triplesByP = new HashMap<>();
    for (int p = 1; p < n; ++p) {
      triplesByP.put(p, triples(p));
    }
    final Set<String> result = new HashSet<>();
    final int totalArea = n * n;
    for (int p = 1; p < n; ++p) {
      final int remArea = totalArea - p * p;
      final int rRows = n - p;
      for (final Collection<Point> trip : triplesByP.get(p)) {
        if (isOk(trip, remArea, rRows)) {
          final TreeSet<Point> quad = new TreeSet<>(trip);
          quad.add(new Point(remArea, rRows));
          if (quad.size() < 4) {
            continue; // Not all were distinct
          }
          result.add(quad.toString());
        }
      }
    }
    return result;
  }

  private static List<List<Point>> splitPFAD(final int h, final int k, final int j) {
    final Point i1 = new Point(j, k + h - j);
    final Point i2 = new Point(j, 0);
    final Point p = new Point(h, k);
    final Point f = new Point(0, h + k);
    final Point a = new Point(0, 0);
    final Point d = new Point(h, 0);
    final List<Point> left = Arrays.asList(i1, f, a, i2);
    final List<Point> right = Arrays.asList(p, d, i2, i1);
    return Arrays.asList(left, right);
  }

  private static List<List<Point>> splitPDBE(final int n, final int h, final int k, final int j) {
    final Point i1 = new Point(h, j);
    final Point i2 = new Point(n - j, j);
    final Point p = new Point(h, k);
    final Point d = new Point(h, 0);
    final Point b = new Point(n, 0);
    final Point e = new Point(n - k, k);
    final List<Point> lower = Arrays.asList(i1, i2, b, d);
    final List<Point> upper = Arrays.asList(p, e, i2, i1);
    return Arrays.asList(lower, upper);
  }

  private static List<List<Point>> splitPECF(final int n, final int h, final int k, final int j) {
    final Point i1 = new Point(j - k, k);
    final Point i2 = new Point(0, j);
    final Point p = new Point(h, k);
    final Point e = new Point(n - k, k);
    final Point c = new Point(0, n);
    final Point f = new Point(0, h + k);
    final List<Point> inner = Arrays.asList(p, i1, i2, f);
    final List<Point> outer = Arrays.asList(i1, e, c, i2);
    return Arrays.asList(inner, outer);
  }

  private static Set<String> generateCategoryB(final int n) {
    final Set<String> quads = new HashSet<>();
    for (int h = 1; h < n; ++h) {
      for (int k = 1; k < n; ++k) {
        if (h + k >= n) {
          continue;
        }
        // base 3 trapezoids
        final List<List<Point>> polys = threeTrapezoidPolygons(n, h, k);
        final int areaA = areaInUnits(polys.get(0));
        final int areaB = areaInUnits(polys.get(1));
        final int areaC = areaInUnits(polys.get(2));
        final HashSet<Point> base = new HashSet<>();
        base.add(new Point(areaB, k));
        base.add(new Point(areaC, n - h - k));
        base.add(new Point(areaA, h));
        if (base.size() < 3) {
          continue;
        }

        // split PFAD
        for (int a = 1; a < h; ++a) {
          final List<List<Point>> split = splitPFAD(h, k, a);
          final TreeSet<Point> quad = new TreeSet<>();
          quad.add(new Point(areaB, k));
          quad.add(new Point(areaC, n - h - k));
          quad.add(new Point(areaInUnits(split.get(0)), a));
          quad.add(new Point(areaInUnits(split.get(1)), h - a));
          if (quad.size() == 4) {
            quads.add(quad.toString());
          }
        }

        // split PDBE
        for (int b = 1; b < k; ++b) {
          final List<List<Point>> split = splitPDBE(n, h, k, b);
          final TreeSet<Point> quad = new TreeSet<>();
          quad.add(new Point(areaInUnits(split.get(1)), k - b));
          quad.add(new Point(areaC, n - h - k));
          quad.add(new Point(areaA, h));
          quad.add(new Point(areaInUnits(split.get(0)), b));
          if (quad.size() == 4) {
            quads.add(quad.toString());
          }
        }

        // split PECF
        for (int c = h + k + 1; c < n; ++c) {
          final List<List<Point>> split = splitPECF(n, h, k, c);
          final TreeSet<Point> quad = new TreeSet<>();
          quad.add(new Point(areaB, k));
          quad.add(new Point(areaInUnits(split.get(0)), c - (h + k)));
          quad.add(new Point(areaInUnits(split.get(1)), n - c));
          quad.add(new Point(areaA, h));
          if (quad.size() == 4) {
            quads.add(quad.toString());
          }
        }
      }
    }
    return quads;
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(generateCategoryA(mN).size() + generateCategoryB(mN).size());
  }
}
