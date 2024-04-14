package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061808 a(n) is the smallest number with all digits odd that is divisible by 2n-1.
 * @author Sean A. Irvine
 */
public class A061808 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    long k = 0;
    while (true) {
      final Z t = mN.multiply(++k);
      if ((Functions.SYNDROME.i(t) & 0b0101010101) == 0) {
        return t;
      }
    }
  }
}

