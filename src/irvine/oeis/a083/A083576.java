package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A083576 Least n-digit prime star number.
 * @author Sean A. Irvine
 */
public class A083576 extends Sequence2 {

  // After Robert Israel

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z t = Functions.CEIL_SQRT.z(Z.TEN.pow(mN - 1).multiply(6).add(3)).add(3);
    Z k = t.add(5).divide(6);
    while (true) {
      final Z s = k.multiply(k.subtract(1)).multiply(6).add(1);
      if (s.isProbablePrime()) {
        return s;
      }
      k = k.add(1);
    }
  }
}
