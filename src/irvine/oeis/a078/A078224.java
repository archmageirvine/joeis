package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078224 a(n) = A078223(n+1)/A078223(n).
 * @author Sean A. Irvine
 */
public class A078224 extends Sequence1 {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    Z t = mA;
    while (true) {
      t = t.add(mA);
      if (t.mod(10) != 0 && (Functions.SYNDROME.i(t) & 0b1010101010) == 0) {
        final Z res = t.divide(mA);
        mA = t;
        return res;
      }
    }
  }
}

