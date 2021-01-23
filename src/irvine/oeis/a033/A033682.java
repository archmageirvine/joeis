package irvine.oeis.a033;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033682 Numbers of the form (q^2+(q+1)^2)*(r^2+(r+1)^2), q,r &gt;= 1.
 * @author Sean A. Irvine
 */
public class A033682 implements Sequence {

  private long mN = 23;
  
  @Override
  public Z next() {
    while (true) {
      mN += 2; // all terms odd
      if (mN % 10 == 7) {
        continue; // all terms = 1,3,5,9 (mod 10)
      }
      final long sn = LongUtils.sqrt(mN);
      long q = 0;
      while (true) {
        final long s = ++q * q + (q + 1) * (q + 1);
        if (s > sn) {
          break;
        }
        if (mN % s == 0) {
          final long m = mN / s;
          final long disc = 2 * m - 1;
          final long sq = LongUtils.sqrt(disc);
          if (sq * sq == disc && ((sq - 1) & 1) == 0) {
            //System.out.println(mN + " " + s + " disc=" + disc + " q=" + q + " r=" + (sq - 1) / 2);
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
