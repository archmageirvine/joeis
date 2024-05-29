package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069970 Numbers n such that sigma(reverse(n)) = sigma(reverse(n-1)) + sigma(reverse(n-2)).
 * @author Sean A. Irvine
 */
public class A069970 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.l(Functions.REVERSE.l(++mN)) == Functions.SIGMA.l(Functions.REVERSE.l(mN - 1)) + Functions.SIGMA.l(Functions.REVERSE.l(mN - 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
