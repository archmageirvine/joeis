package irvine.oeis.a023;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023153 Number of cycles of function f(x) = x^2 mod n.
 * @author Sean A. Irvine
 */
public class A023153 extends Sequence1 {

  private int mN = 0;

  protected int power() {
    return 2;
  }

  @Override
  public Z next() {
    ++mN;
    int components = 0;
    long mark = 0; // used so we can tell if we hit the same or an earlier cycle
    final long[] seen = new long[mN];
    for (int k = 0; k < mN; ++k) {
      if (seen[k] == 0) {
        ++components; // optimistically assume k leads to a new cycle
        ++mark;
        seen[k] = mark;
        long j = k;
        while (true) {
          j = LongUtils.modPow(j, power(), mN);
          final long t = seen[(int) j];
          if (t == mark) {
            // We hit something on the cycle under construction
            // So we are finished with this cycle, go back to looking for next unused element
            break;
          } else if (t == 0) {
            // A value we have not reached before
            seen[(int) j] = mark;
          } else if (t < mark) {
            // Merges with a previous cycle, so k was not on a new cycle after all
            --components;
            break;
          }
        }
      }
    }
    return Z.valueOf(components);
  }
}

