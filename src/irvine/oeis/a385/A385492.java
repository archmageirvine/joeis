package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385492 Numbers y such that there exists an integer 0 &lt; x &lt; y such that x^sigma(x) * y^sigma(y) = (x*y)^(x+y).
 * @author Sean A. Irvine
 */
public class A385492 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(Functions.SIGMA.z(mN));
      for (long k = 1; k < mN; ++k) {
        final Z u = Z.valueOf(k).pow(Functions.SIGMA.z(k));
        if (t.multiply(u).equals(Z.valueOf(mN * k).pow(mN + k))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
