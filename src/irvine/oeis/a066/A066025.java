package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066025 Numbers k such that gcd(sigma(k), sigma(k+1)) &gt; k.
 * @author Sean A. Irvine
 */
public class A066025 extends Sequence1 {

  private long mN = 3;
  private Z mS = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      final Z t = mS;
      final Z n = Z.valueOf(mN);
      mS = Functions.SIGMA1.z(++mN);
      if (t.gcd(mS).compareTo(n) > 0) {
        return n;
      }
    }
  }
}
