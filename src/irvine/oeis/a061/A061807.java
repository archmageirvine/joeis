package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061807 Smallest positive multiple of n containing only even digits.
 * @author Sean A. Irvine
 */
public class A061807 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z t = mN.multiply(++k);
      if ((Functions.SYNDROME.i(t) & 0b1010101010) == 0) {
        return t;
      }
    }
  }
}

