package irvine.oeis.a018;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018205 Let m=n+1; a(n) is the least positive integer s, not a multiple of m, such that if 1&lt;=d&lt;=m and (d,m)=1, then d divides one of the numbers s-m, s-2m, ..., s-m[ s/m ].
 * @author Sean A. Irvine
 */
public class A018205 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    while (true) {
      if (++s % mN != 0) {
        boolean ok = true;
        for (long d = 1; d <= mN; ++d) {
          if (Functions.GCD.l(d, mN) == 1) {
            boolean ok2 = false;
            for (long t = s - mN; t > 0; t -= mN) {
              if (t % d == 0) {
                ok2 = true;
                break;
              }
            }
            if (!ok2) {
              ok = false;
              break;
            }
          }
        }
        if (ok) {
          return Z.valueOf(s);
        }
      }
    }
  }
}

