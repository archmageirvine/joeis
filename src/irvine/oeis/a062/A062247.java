package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a141.A141900;

/**
 * A062247 Let f(h) = A141900(h) = 2^h * 3^i * 5^j * ... be the smallest term in A141586 that is divisible by 2^h but not by 2^(h+1). Sequence gives values of h where i increases.
 * @author Sean A. Irvine
 */
public class A062247 extends A141900 {

  private int mThrees = -1;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final int v = Functions.VALUATION.i(t, Z.THREE);
      if (v > mThrees) {
        mThrees = v;
        return Z.valueOf(mN);
      }
    }
  }
}

