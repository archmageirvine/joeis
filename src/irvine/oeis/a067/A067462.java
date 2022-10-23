package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067462 a(n) = (1! + 2! + ... + (n-1)!) mod n.
 * @author Sean A. Irvine
 */
public class A067462 extends Sequence1 {

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
