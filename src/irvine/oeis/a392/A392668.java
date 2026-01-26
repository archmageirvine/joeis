package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392668 allocated for Alexander Violette.
 * @author Sean A. Irvine
 */
public class A392668 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(2 * mN - Functions.OMEGA.i(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
