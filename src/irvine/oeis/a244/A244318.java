package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.a014.A014418;

/**
 * A244318 Product of digits+1 of n in Greedy Catalan Base (A014418).
 * @author Georg Fischer
 */
public class A244318 extends A014418 {

  private int mN = -1;

  @Override
  public Z next() {
    final String gcb = super.a(++mN).toString();
    long prod = 1L;
    for (int pos = gcb.length() - 1; pos >= 0; --pos) {
      prod *= gcb.charAt(pos) - '0' + 1;
    }
    return Z.valueOf(prod);
  }
}
