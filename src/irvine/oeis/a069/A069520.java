package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069520 Numbers k such that (1/k) * Sum_{d|k} d*sigma(d) is an integer.
 * @author Sean A. Irvine
 */
public class A069520 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Integers.SINGLETON.sumdiv(++mN, d -> Functions.SIGMA1.z(d).multiply(d)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
