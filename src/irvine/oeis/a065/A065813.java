package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A065813 Least m such that (p^(2*m+1)-1)/(p-1) is a prime, where p = prime(n).
 * @author Sean A. Irvine
 */
public class A065813 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p1 = p.subtract(1);
    final Z p2 = p.square();
    long m = 0;
    Z pp = p;
    while (true) {
      ++m;
      pp = pp.multiply(p2);
      if (pp.subtract(1).divide(p1).isProbablePrime()) {
        return Z.valueOf(m);
      }
      if (mVerbose && m % 100 == 0) {
        StringUtils.message("Search for " + p + " completed to m=" + m);
      }
    }
  }
}
