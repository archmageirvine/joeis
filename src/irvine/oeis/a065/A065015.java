package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065015 Sum divides product: number of integer solutions (w,x,y,z), w &gt;= x &gt;= y &gt;= z &gt; 0, to the equation w*x*y*z = n*(w+x+y+z).
 * @author Sean A. Irvine
 */
public class A065015 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 1; x * x * x <= 4 * mN; ++x) {
      for (long y = x; y * y * x <= 4 * mN; ++y) {
        for (long z = Math.max(y, mN / (x * y) + 1); z * x * y <= 4 * mN; ++z) {
          final long d = z * y * x - mN;
          if (d != 0) {
            final long n = mN * (z + y + x);
            if (n % d == 0 && n >= d * z) {
              ++cnt;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
