package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074818 Number of integers in {1, 2, ..., prime(n)} that are coprime to n.
 * @author Sean A. Irvine
 */
public class A074818 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    ++mN;
    long cnt = 1;
    for (long k = 2; k <= p; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
