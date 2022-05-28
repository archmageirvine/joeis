package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A067462.
 * @author Sean A. Irvine
 */
public class A067462 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    long f = 1;
    for (long k = 1; k <= mN && f != 0; ++k) {
      f *= k;
      f %= mN;
      sum += f;
      sum %= mN;
    }
    return Z.valueOf(sum);
  }
}
