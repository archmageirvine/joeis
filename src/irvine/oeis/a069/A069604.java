package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014261;

/**
 * A069604 a(1) = 1; for n&gt;1, a(n) = smallest number with all odd digits giving a prime in concatenation with the previous terms.
 * @author Sean A. Irvine
 */
public class A069604 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Sequence s = new A014261();
    Z mul = Z.TEN;
    mA = mA.multiply(10);
    while (true) {
      final Z c = s.next();
      if (c.compareTo(mul) >= 0) {
        mul = mul.multiply(10);
        mA = mA.multiply(10);
      }
      final Z t = mA.add(c);
      if (t.isProbablePrime()) {
        mA = t;
        return c;
      }
    }
  }
}
