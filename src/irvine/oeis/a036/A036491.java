package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A036491 Transformation of A036490: 5^a*7^b*11^c -&gt; 5^a*7^floor((b+2)/2)*11^c.
 * @author Sean A. Irvine
 */
public class A036491 extends A036490 {

  @Override
  public Z next() {
    final Z n = super.next();
    final int b = Math.max(1, ZUtils.valuation(Z.SEVEN, n)); // this kludge is weird but apparently necessary!
    final int u = (b + 2) / 2 - b;
    return u >= 0 ? n.multiply(Z.SEVEN.pow(u)) : n.divide(Z.SEVEN.pow(-u));
  }
}
