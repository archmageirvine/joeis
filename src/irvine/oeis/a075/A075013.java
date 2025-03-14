package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075013 Smallest k such that the decimal concatenation of k and k+1 is divisible by n.
 * @author Sean A. Irvine
 */
public class A075013 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long lim = 10;
    while (true) {
      if (++k + 1 == lim) {
        lim *= 10;
      }
      if ((k * lim + k + 1) % mN == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

