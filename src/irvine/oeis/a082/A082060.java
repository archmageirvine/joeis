package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082060 Numbers n such that n and phi(n) have the same distinct decimal digits.
 * @author Sean A. Irvine
 */
public class A082060 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SYNDROME.i(++mN) == Functions.SYNDROME.i(Functions.PHI.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
