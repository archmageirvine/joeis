package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024817.
 * @author Sean A. Irvine
 */
public class A024817 implements Sequence {

  private long mN = 0;

  private CR t(final long n) {
    return ComputableReals.SINGLETON.tan(CR.HALF_PI.subtract(CR.valueOf(n).inverse()));
  }

  @Override
  public Z next() {
    ++mN;
    return t(mN + 1).multiply(CR.TWO).subtract(t(mN)).subtract(t(mN + 2)).inverse().floor();
  }
}
