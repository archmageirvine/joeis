package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;
import irvine.util.Point;

/**
 * A003304 Number of figure 8's with 2n edges on the square lattice.
 * @author Sean A. Irvine
 */
public class A003304 extends A002931 {

  /** Construct the sequence. */
  public A003304() {
    super(2);
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  {
    super.next(); // skip size 2, there are no figure 8s of this size
  }

  private Polygon augment(final int... coords) {
    Polygon p = null;
    for (int k = 0; k < coords.length; k += 2) {
      p = new Polygon(p, new Point(coords[k], coords[k + 1]));
    }
    return p;
  }

  private String latexPolygon(final Polygon polygon) {
    final StringBuilder sb = new StringBuilder("\\draw ");
    Point first = null;
    for (final Point pt : polygon) {
      if (first == null) {
        first = pt;
      } else {
        sb.append(" -- ");
      }
      sb.append(pt);
    }
    sb.append(" -- ").append(first).append(";\n");
    for (final Point pt : polygon) {
      sb.append("\\fill ").append(pt).append(" circle (3pt);\n");
    }
    return sb.toString();
  }

  private void dump(final Polygon polygon, final int... coords) {
    System.out.println("\\begin{tikzpicture}[scale=0.3]");
    System.out.print(latexPolygon(polygon));
    System.out.print(latexPolygon(augment(coords)));
    System.out.println("\\end{tikzpicture}");
  }

  @Override
  protected Z postFilter() {
    if (mN == 4) {
      // This is the only case where translation of the polygon could get you the same thing
      // after adding a simple square.  Rather than slowing down all the calculations by
      // checking for this, special case this smallest value.
      return Z.TWO;
    }
    // Need to try adding a square at each position of each polygon
    long c = 0;
    for (final Polygon polygon : mPolygons) {
      for (final Point pt : polygon) {
        final int x = pt.left();
        final int y = pt.right();
        if (!polygon.contains(new Point(x + 1, y))) {
          if (!polygon.contains(new Point(x + 1, y + 1)) && !polygon.contains(new Point(x, y + 1))) {
            ++c;
            if (mVerbose) {
              dump(polygon, x, y, x + 1, y, x + 1, y + 1, x, y + 1);
            }
          }
          if (!polygon.contains(new Point(x + 1, y - 1)) && !polygon.contains(new Point(x, y - 1))) {
            ++c;
            if (mVerbose) {
              dump(polygon, x, y, x + 1, y, x + 1, y - 1, x, y - 1);
            }
          }
        }
        if (!polygon.contains(new Point(x - 1, y))) {
          if (!polygon.contains(new Point(x - 1, y + 1)) && !polygon.contains(new Point(x, y + 1))) {
            ++c;
            if (mVerbose) {
              dump(polygon, x, y, x - 1, y, x - 1, y + 1, x, y + 1);
            }
          }
          if (!polygon.contains(new Point(x - 1, y - 1)) && !polygon.contains(new Point(x, y - 1))) {
            ++c;
            if (mVerbose) {
              dump(polygon, x, y, x - 1, y, x - 1, y - 1, x, y - 1);
            }
          }
        }
      }
    }
    return Z.valueOf(c);
  }
}

