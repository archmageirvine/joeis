package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036229 Smallest n-digit prime containing only digits 1 or 2 or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A036229 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    Z m = mN;
    while (true) {
      final Z t = new Z(m.toString(2).substring(1).replace('1', '2').replace('0', '1'));
      if (t.isProbablePrime()) {
        return t;
      }
      m = m.add(1);
    }
  }
}

