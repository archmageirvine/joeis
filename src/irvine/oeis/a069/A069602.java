package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071904;

/**
 * A069602 a(1) = 1; a(n) = smallest composite number such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A069602 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Sequence s = new A071904();
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
