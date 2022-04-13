package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056051 a(n) = (n-2)! - 1 (mod n).
 * @author Sean A. Irvine
 */
public class A056051 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long f = 1;
    for (long k = 2; k <= mN - 2; ++k) {
      f *= k;
      f %= mN;
    }
    return Z.valueOf(f - 1);
  }
}
