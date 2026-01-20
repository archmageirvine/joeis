package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083288 Sigma unitary-sigma perfect numbers: numbers m which satisfy the following equation for some integer k: sigma(usigma(m)) = k*m where usigma(m) is sum of unitary divisors of m.
 * @author Sean A. Irvine
 */
public class A083288 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(Functions.USIGMA1.z(++mN)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
