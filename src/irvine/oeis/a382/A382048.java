package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A382048 Starting from n and decrement, d = 1 we repeatedly subtract d until we reach a multiple of d+1. Whereupon we set d := d+1 and continue the process. a(n) is the total number of subtractions required to reduce n to 0.
 * @author Sean A. Irvine
 */
public class A382048 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long d = 1;
    long m = mN;
    while (m != 0) {
      ++cnt;
      m -= d;
      if (m % (d + 1) == 0) {
        ++d;
      }
    }
    return Z.valueOf(cnt);
  }
}
