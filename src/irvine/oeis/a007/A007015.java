package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007015 a(n) = smallest k such that phi(n+k) = phi(k).
 * @author Sean A. Irvine
 */
public class A007015 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (LongUtils.phi(++k) != LongUtils.phi(mN + k)) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}

