package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028502 2772-hyperperfect numbers: n = 2772*(sigma(n)-n-1) + 1.
 * @author Sean A. Irvine
 */
public class A028502 extends Sequence1 {

  private long mN = 95295816;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Functions.SIGMA.l(++mN);
      final long s = sigma - mN - 1;
      if (2772 * s == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
