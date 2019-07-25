package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024817 <code>a(n) = [ 1/(2*t(n+1) - t(n) - t(n+2)) ]</code>, where <code>t(n) = tan(pi/2 - 1/n)</code> satisfies <code>n-1 &lt; t(n) &lt; n</code> for all <code>n &gt;= 1</code>.
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
