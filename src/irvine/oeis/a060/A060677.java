package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.q.Q;
import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;
import irvine.util.string.StringUtils;

/**
 * A060677 Number of linear n-celled polyominoes, those with the property that a line can be drawn that intersects the interior of every cell.
 * @author Sean A. Irvine
 * @author Richard Littin
 */
public class A060677 extends Sequence1 {

  // If an animal is linear, then there exists an animal with one less cell
  // which is also linear. Hence, we can forward generate for a single cell.
  // In fact, we can always extend either by taking the last point and
  // increasing x or y by one cell.  However, we do need to avoid generating
  // symmetric duplicates.
  //
  // Some care is needed checking the animal is linear, especially given the
  // requirement that the line passes through the interior of each cell.
  // Detection of linear animals based on Python code by Richard Littin,
  // where the minimum and maximum possible slopes of each layer and pair
  // of layers is used to determine whether a line is possible.  This
  // procedure by itself does not produce a final line, but given the bounds
  // constructed during the process it is possible to demonstrate a specific
  // line meeting the criteria.
  //
  // Care has been taken to do the detection of a line in exact arithmetic
  // (although testing indicates ordinary floating-point arithmetic is
  // sufficient for all the terms of the OEIS Data line).  The actual
  // demonstration of a line is done here with floating-point, but that is
  // only used to construct the pictures in the associated document.

  private static final Lattice L = Lattices.Z2;
  private static final String LINE_COLOR = "black!30!green";
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private List<Animal> mAnimals = new ArrayList<>();

  private static final class Point extends Pair<Integer, Integer> {
    private Point(final int x, final int y) {
      super(x, y);
    }
  }

  private static final class Segment {
    private final Point mP1;
    private final Point mP2;
    private Segment(final Point p1, final Point p2) {
      mP1 = p1;
      mP2 = p2;
    }

    @Override
    public String toString() {
      return "[" + mP1 + " - " + mP2 + "]";
    }
  }

  private static final class Line implements Comparable<Line> {
    private final Q mM; // null indicates a vertical line
    private final Q mC;
//    private final double mT;

    private Line(final Point p1, final Point p2) {
      final int x = p1.left() - p2.left();
      final int y = p1.right() - p2.right();
      if (x == 0) {
        // Vertical
        mM = null;
        mC = null;
      } else {
        mM = new Q(y, x);
        mC = new Q(p1.right()).subtract(mM.multiply(p1.left()));
      }
//      mT = Math.atan2(y, x);
    }

    @Override
    public int compareTo(final Line other) {
      if (mM == null) {
        if (other.mM == null) {
          return 0;
        }
        return other.mM.signum() < 0 ? -1 : 1;
      }
      if (mM.equals(other.mM)) {
        return 0;
      }
      final int sign1 = mM.signum();
      if (other.mM == null) {
        return sign1 >= 0 ? -1 : 1;
      }
      final int sign2 = other.mM.signum();
      if (sign1 >= 0) {
        return sign2 < 0 || mM.compareTo(other.mM) <= 0 ? -1 : 1;
      } else {
        return mM.compareTo(other.mM) < 0 ? 1 : -1;
      }
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Line)) {
        return false;
      }
      final Line other = (Line) obj;
      return mC.equals(other.mC) && mM.equals(other.mM);
    }

    @Override
    public int hashCode() {
      return mC.hashCode() + mM.hashCode();
    }

    @Override
    public String toString() {
      if (mM == null) {
        return "vertical";
      }
      return mM + " x " + (mC.signum() < 0 ? "-" : "+") + mC.abs();
    }
  }

  static final class Range {
    private final Line mMinimum;
    private final Line mMaximum;

    private Range(final Line l1, final Line l2) {
      mMinimum = l1;
      mMaximum = l2;
    }

    private boolean isValid() {
      return mMinimum.compareTo(mMaximum) < 0;
    }

    @Override
    public String toString() {
      return "(" + mMinimum + " : " + mMaximum + ")";
    }

    private Range reduce(final Range other) {
      return new Range(
        mMinimum.compareTo(other.mMinimum) > 0 ? mMinimum : other.mMinimum,
        mMaximum.compareTo(other.mMaximum) < 0 ? mMaximum : other.mMaximum
      );
    }
  }

  /**
   * Test if the specified animal is linear, returning a range for a proof of linearity
   * or null if the animal is not linear. Note this method assumes the animal is entirely
   * within first quadrant with first cell <code>(0,0)</code> and that all layers overlap
   * by precisely one cell.  Be very careful attempting to apply this outside of this class.
   * Note that although this method returns a floating-point description of a line within
   * the linear animal (if possible), this is merely a convenience for plotting, the actual
   * detection of the line is not dependent on floating-point arithmetic.
   * @param animal the animal
   * @return linear status (either the <code>m</code> and <code>c</code> values for a line
   * or <code>null</code> if no line is possible).
   */
  double[] isLinear(final Animal animal) {
    final int[] pieces = layerLengths(animal);
    if (pieces.length == 1) {
      final Line l1 = new Line(new Point(0, 0), new Point(pieces[0], 1));
      final Line l2 = new Line(new Point(0, 1), new Point(pieces[0], 0));
      return getALine(new Range(l1, l2), Collections.singletonList(new Segment(new Point(0, 0), new Point(pieces[0], 1))));
    }
    final List<Segment> segments = new ArrayList<>();
    int x = 0;
    int y = 0;
    if (pieces[0] > 1) {
      segments.add(new Segment(new Point(1, 1), new Point(1, 0)));
    }
    for (final int p : pieces) {
      assert p > 0;
      if (y != 0) {
        segments.add(new Segment(new Point(x, y), new Point(x + 1, y)));
      }
      ++y;
      x += p - 1;
    }
    if (pieces[pieces.length - 1] > 1) {
      segments.add(new Segment(new Point(x, y), new Point(x, y - 1)));
    }
    Range animalRange = null;
    for (int i = 0; i < segments.size() - 1; ++i) {
      for (int j = 0; j <= i; ++j) {
        final Segment si = segments.get(i + 1);
        final Segment sj = segments.get(j);
        final Line l1 = new Line(si.mP1, sj.mP2);
        final Line l2 = new Line(si.mP2, sj.mP1);
        final Range r = l1.compareTo(l2) < 0 ? new Range(l1, l2) : new Range(l2, l1);
        animalRange = animalRange == null ? r : animalRange.reduce(r);
        if (!animalRange.isValid()) {
          return null;
        }
      }
    }
    return getALine(animalRange, segments);
  }

  private static String toTikz(final long x, final long y, final String modifier) {
    return "\\draw" + modifier + " (" + x + "," + y + ") -- (" + (x + 1) + "," + y + ") -- (" + (x + 1) + "," + (y + 1) + ") -- (" + x + "," + (y + 1) + ") -- cycle;";
  }

  private static double[] getALine(final Range range, final List<Segment> segments) {
    if (range == null) {
      return null;
    }
    final Q m;
    if (range.mMinimum.mM == null || range.mMaximum.mM == null) {
      if (range.mMaximum.mM != null) {
        m = range.mMaximum.mM;
      } else if (range.mMinimum.mM != null) {
        m = range.mMinimum.mM;
      } else {
        m = new Q(1000);
      }
    } else {
      m = range.mMaximum.mM.add(range.mMinimum.mM).divide(2);
    }
    // This is only used for plotting so floating-point is fine
    final double aveLineM = m.doubleValue();
    double maxMinC = Double.NaN;
    double minMaxC = Double.NaN;
    for (final Segment s : segments) {
      final double c1 = s.mP1.right().doubleValue() - aveLineM * s.mP1.left().doubleValue();
      final double c2 = s.mP2.right().doubleValue() - aveLineM * s.mP2.left().doubleValue();
      final double minC, maxC;
      if (c1 < c2) {
        minC = c1;
        maxC = c2;
      } else {
        minC = c2;
        maxC = c1;
      }
      if (Double.isNaN(maxMinC) || minC > maxMinC) {
        maxMinC = minC;
      }
      if (Double.isNaN(minMaxC) || maxC < minMaxC) {
        minMaxC = maxC;
      }
    }
    return new double[] {aveLineM, (maxMinC + minMaxC) / 2};
  }

  private static String toTikz(final Animal animal, final double[] line) {
    final StringBuilder sb = new StringBuilder();
    sb.append("\\item \\begin{tikzpicture}[scale=0.25]");
    for (final long point : animal.points()) {
      final long x = L.ordinate(point, 0);
      final long y = L.ordinate(point, 1);
      sb.append(toTikz(x, y, "[fill=gray!20]")).append(toTikz(x, y, "[line width=0.1mm]"));
    }
    if (line != null) {
      final long tx = animal.extent(L, 0);
      sb.append("\\clip(0,0) rectangle (")
        .append(tx + 1)
        .append(",")
        .append(animal.extent(L, 1) + 1)
        .append("); ");
      if ("(0,0),(1,0),(1,1)".equals(animal.toString(L))) {
        sb.append("\\draw[color=").append(LINE_COLOR).append("](0,-0.2) -- (2,1.2);");
      } else {
        sb.append("\\draw[color=").append(LINE_COLOR).append("](0,")
          .append(DoubleUtils.NF5.format(line[1]))
          .append(") -- (")
          .append(tx + 1)
          .append(',')
          .append(DoubleUtils.NF5.format(line[0] * (tx + 1) + line[1]))
          .append(");");
      }
    }
    sb.append("\\end{tikzpicture}");
    return sb.toString();
  }

  private static int[] layerLengths(final Animal animal) {
    final long[] pts = animal.points();
    final long ty = L.ordinate(pts[pts.length - 1], 1);

    if (ty == 0) {
      return new int[] {animal.size()};
    }

    final int[] layerLengths = new int[(int) ty + 1];
    for (int k = 0, i = 0, j = 0; k < layerLengths.length; ++k) {
      while (j < pts.length && L.ordinate(pts[j], 1) == k) {
        ++j;
      }
      layerLengths[k] = j - i;
      i = j;
    }
    return layerLengths;
  }


  @Override
  public Z next() {
    if (mAnimals.isEmpty()) {
      mAnimals.add(new Animal(L.origin()));
      if (mVerbose) {
        StringUtils.message("\\subsection*{Linear animals with 1 cell}");
        StringUtils.message("\\begin{enumerate}\\item\\begin{tikzpicture}[scale=0.25]\\draw[fill=gray!20] (0,0) -- (1,0) -- (1,1) -- (0,1) -- cycle;\\draw (0,0) -- (1,0) -- (1,1) -- (0,1) -- cycle;\\clip(0,0) rectangle (1,1); \\draw[color=" + LINE_COLOR + "](0,0.5) -- (1,0.5);\\end{tikzpicture}\\end{enumerate}");
      }
      return Z.ONE;
    } else {
      // Track canons separately from the main list, because the canonicalization
      // procedure can mess with the order in which points are added.
      if (mVerbose) {
        StringUtils.message("\\subsection*{Linear animals with " + (mAnimals.get(0).size() + 1) + " cells}");
        StringUtils.message("\\begin{enumerate}");
      }
      final HashSet<Animal> canons = new HashSet<>();
      final List<Animal> linearAnimals = new ArrayList<>();
      for (final Animal animal : mAnimals) {
        final long pt = animal.points()[animal.size() - 1];
        final long x = L.ordinate(pt, 0);
        final long y = L.ordinate(pt, 1);
        final Animal a = new Animal(animal, L.toPoint(x + 1, y));
        final double[] lineA = isLinear(a);
        if (lineA != null) {
          if (canons.add(L.freeCanonical(a)) && mVerbose) {
            StringUtils.message(toTikz(a, lineA));
          }
          linearAnimals.add(a);
        }
        final Animal b = new Animal(animal, L.toPoint(x, y + 1));
        final double[] lineB = isLinear(b);
        if (lineB != null) {
          if (canons.add(L.freeCanonical(b)) && mVerbose) {
            StringUtils.message(toTikz(b, lineB));
          }
          linearAnimals.add(b);
        }
      }
      if (mVerbose) {
        StringUtils.message("\\end{enumerate}");
      }
      mAnimals = linearAnimals;
      return Z.valueOf(canons.size());
    }
  }
}
