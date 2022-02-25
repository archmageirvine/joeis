package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A122840 a(n) is the number of 0's at the end of n when n is written in base 10.
 * @author Georg Fischer
 */
public class A122840 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    int k = 0;
    Z pow10 = Z.TEN;
    while (mN.mod(pow10).isZero()) {
      ++k;
      pow10 = pow10.multiply(10);
    }
    return Z.valueOf(k);
  }
}
