package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011777 a(n) = least k&gt;1 such that k^n divides k!.
 * @author Sean A. Irvine
 */
public class A011777 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.TWO;
    while (true) {
      final Z q = k.pow(mN);
      final int ki = k.intValueExact();
      if (Functions.FACTORIAL.z(ki).mod(q).isZero() && !Functions.FACTORIAL.z(ki).mod(q.multiply(k)).isZero()) {
        return k;
      }
      k = k.add(1);
    }
  }
}
