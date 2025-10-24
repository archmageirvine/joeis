package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389882 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A389882 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final String s = String.valueOf(++mN);
    for (int k = 0; k < s.length(); ++k) {
      sum = sum.add(new Z(s.substring(k) + s.substring(0, k)));
    }
    return sum;
  }
}
