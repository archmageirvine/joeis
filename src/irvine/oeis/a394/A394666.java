package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394666 allocated for Sabuhi A. Amirov.
 * @author Sean A. Irvine
 */
public class A394666 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long m = 2 * ++mN - 1;
    long f = 1 % m;
    for (long k = 2; k <= mN && f != 0; ++k) {
      f *= k;
      f %= m;
    }
    return Z.valueOf(f);
  }
}
