package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005128 Number of k for which n does not divide Stirling_2 subset numbers S(n, k).
 * @author Sean A. Irvine
 */
public class A005128 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long c = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.STIRLING2.z(mN, k).mod(mN) != 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

