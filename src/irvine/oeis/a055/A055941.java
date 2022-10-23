package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055941 a(n) = Sum_{j=0..k-1} (i(j) - j) where n = Sum_{j=0..k-1} 2^i(j).
 * @author Sean A. Irvine
 */
public class A055941 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    long sum = 0;
    while (m != 0) {
      if ((m & 1) == 0) {
        ++cnt;
      } else {
        sum += cnt;
      }
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }
}
