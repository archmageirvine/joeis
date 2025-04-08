package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076528 Numbers n such that sigma(n) = sigma(n-1) - sigma(n-2).
 * @author Sean A. Irvine
 */
public class A076528 extends Sequence1 {

  private long mN = 954;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.l(++mN) == Functions.SIGMA1.l(mN - 1) - Functions.SIGMA1.l(mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
