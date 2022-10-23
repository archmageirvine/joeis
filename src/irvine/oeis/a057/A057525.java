package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A057525 Number of applications of f to reduce n to 1, where f(k) is the integer among k/2,(k+1)/4, (k+3)/4.
 * @author Sean A. Irvine
 */
public class A057525 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 1) {
      ++cnt;
      if ((m & 1) == 0) {
        m /= 2;
      } else {
        m = (m + 3) / 4;
      }
    }
    return Z.valueOf(cnt);
  }
}
