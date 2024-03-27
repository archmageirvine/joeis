package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A055592 Longest side of congruent triangles with integer sides and positive integer area, ordered by longest side, then second longest side and finally shortest side.
 * @author Sean A. Irvine
 */
public class A055592 extends Sequence1 {

  /**
   * A triangle.
   */
  public static final class Triangle extends Triple<Long> implements Comparable<Triangle> {

    private Triangle(final long a, final long b, final long c) {
      super(a, b, c);
    }

    @Override
    public int compareTo(final Triangle o) {
      final int c = left().compareTo(o.left());
      if (c != 0) {
        return c;
      }
      final int d = mid().compareTo(o.mid());
      if (d != 0) {
        return d;
      }
      return right().compareTo(o.right());
    }
  }

  private int mN = 4; // longest side
  private final TreeSet<Triangle> mA = new TreeSet<>();

  protected Z select(final Triangle t) {
    return Z.valueOf(t.left());
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN;
      for (int b = 1; b <= mN; ++b) {
        for (int c = 1; c <= b; ++c) {
          final Q s = new Q(mN + b + c, 2);
          final Q a2 = s.multiply(s.subtract(mN)).multiply(s.subtract(b)).multiply(s.subtract(c));
          if (a2.isInteger() && a2.signum() > 0 && a2.toZ().isSquare()) {
            mA.add(new Triangle(mN, b, c));
          }
        }
      }
    }
    return select(mA.pollFirst());
  }
}
