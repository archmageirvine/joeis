package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018205 Let <code>m=n+1; a(n)</code> is the least positive integer s, not a multiple of m, such that if <code>1&lt;=d&lt;=m</code> and <code>(d,m)=1</code>, then d divides one of the numbers <code>s-m, s-2m</code>, ..., <code>s-m[ s/m ]</code>.
 * @author Sean A. Irvine
 */
public class A018205 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    while (true) {
      if (++s % mN != 0) {
        boolean ok = true;
        for (long d = 1; d <= mN; ++d) {
          if (LongUtils.gcd(d, mN) == 1) {
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

