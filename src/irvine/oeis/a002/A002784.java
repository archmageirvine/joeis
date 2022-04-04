package irvine.oeis.a002;

import irvine.math.LongUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002784 A problem in parity.
 * @author Sean A. Irvine
 */
public class A002784 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    for (int k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(mN, k) == 1) {
        s += mF.factorial(mN + k - 1).divide(mF.factorial(mN)).divide(mF.factorial(k)).mod(2);
      }
    }
    return Z.valueOf(s);
  }
}
