package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060993 Radii of Integer Distance Skew Tetrahedra.
 * @author Sean A. Irvine
 */
public class A060993 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mC = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || 8 * mA.first() >= mC) {
      ++mC;
      final long c2 = mC * mC;
      for (long b = 1; b <= mC; ++b) {
        final long b2 = b * b;
        for (long a = 1; a <= b; ++a) {
          final long a2 = a * a;
          if (a2 + b2 > c2) {
            final long t = a2 + b2 + c2;
            if ((t & 7) == 0) {
              final long t8 = t / 8;
              final long s = Functions.SQRT.l(t8);
              if (s * s == t8) {
                //System.out.println("(" + a + "," + b + "," + mC + ") -> " + s);
                mA.add(s);
              }
            }
          }
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
