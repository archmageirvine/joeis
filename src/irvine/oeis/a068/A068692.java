package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014263;

/**
 * A068692 Largest n-digit prime with all even digits except for the least significant digit.
 * @author Sean A. Irvine
 */
public class A068692 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.SEVEN;
    }
    if (mA.equals(Z.ONE)) {
      mA = Z.EIGHT;
      return Z.valueOf(89);
    }
    mA = mA.multiply(10).add(8);
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
