package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007015 <code>a(n) =</code> smallest k such that <code>phi(n+k) = phi(k)</code>.
 * @author Sean A. Irvine
 */
public class A007015 implements Sequence {

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

