package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A075831 Like A073327, but multiply the numerical values of the letters instead of adding them.
 * @author Sean A. Irvine
 */
public class A075831 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = English.SINGLETON.toRawText(++mN);
    Z prod = Z.ONE;
    for (int k = 0; k < s.length(); ++k) {
      prod = prod.multiply(s.charAt(k) - '`');
    }
    return prod;
  }
}

