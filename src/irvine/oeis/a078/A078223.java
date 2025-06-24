package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078223 a(1) = 2, a(n+1) &gt; a(n) is the smallest multiple of a(n) using only even digits but not divisible by 10 (i.e., having no trailing zeros).
 * @author Sean A. Irvine
 */
public class A078223 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(mA);
        if (t.mod(10) != 0 && (Functions.SYNDROME.i(t) & 0b1010101010) == 0) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

