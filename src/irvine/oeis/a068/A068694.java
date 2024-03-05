package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014263;

/**
 * A068694 Largest n-digit prime with all odd digits.
 * @author Sean A. Irvine
 */
public class A068694 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.SEVEN;
    }
    if (Z.ONE.equals(mA)) {
      mA = Z.NINE;
      return Z.valueOf(97);
    }
    mA = mA.multiply(10).add(9);
    final Sequence s = new A014263();
    while (true) {
      final Z t = mA.subtract(s.next()).multiply(10);
      final Z t9 = t.add(9);
      if (t9.isProbablePrime()) {
        return t9;
      }
      final Z t7 = t.add(7);
      if (t7.isProbablePrime()) {
        return t7;
      }
      final Z t3 = t.add(3);
      if (t3.isProbablePrime()) {
        return t3;
      }
      final Z t1 = t.add(1);
      if (t1.isProbablePrime()) {
        return t1;
      }
    }
  }
}
