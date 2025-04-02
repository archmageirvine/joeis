package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072022.
 * @author Sean A. Irvine
 */
public class A076373 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.PHI.z(mN).multiply2().add(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
