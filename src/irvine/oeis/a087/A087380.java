package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087380 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long t = ++mN;
    long r = 0;
    long m = 1;
    while (t != 0) {
      final long d = t % 10;
      if (d <= 1 || d == 4 || d == 6 || d == 8 || d == 9) {
        r += m;
      }
      t /= 10;
      m *= 10;
    }
    return Z.valueOf(r);
  }
}
