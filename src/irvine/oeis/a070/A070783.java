package irvine.oeis.a070;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A070783 Square of longest side of triangles with sides whose squares are integers and with positive integer area, ordered by longest side, then second longest side and finally shortest side.
 * @author Sean A. Irvine
 */
public class A070783 extends Sequence1 {

  private static final int ACCURACY = -100;

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

  private int mN = 3; // square of longest side
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
          final CR ar = CR.valueOf(mN).sqrt();
          final CR br = CR.valueOf(b).sqrt();
          final CR cr = CR.valueOf(c).sqrt();
          final CR s = ar.add(br).add(cr).divide(2);
          final CR a2 = s.multiply(s.subtract(ar)).multiply(s.subtract(br)).multiply(s.subtract(cr));
          if (a2.isInteger() && a2.signum(ACCURACY) > 0 && a2.assumeInt().toZ().isSquare()) {
            mA.add(new Triangle(mN, b, c));
          }
        }
      }
    }
    return select(mA.pollFirst());
  }
}
