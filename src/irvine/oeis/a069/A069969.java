package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069969 Numbers n such that phi(reverse(n)) = phi(reverse(n-1)) + phi(reverse(n-2)).
 * @author Sean A. Irvine
 */
public class A069969 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.l(Functions.REVERSE.l(++mN)) == Functions.PHI.l(Functions.REVERSE.l(mN - 1)) + Functions.PHI.l(Functions.REVERSE.l(mN - 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
