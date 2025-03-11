package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075861 Least k such that (n-k) divides (n+k).
 * @author Sean A. Irvine
 */
public class A075861 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if ((mN + ++k) % (mN - k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
