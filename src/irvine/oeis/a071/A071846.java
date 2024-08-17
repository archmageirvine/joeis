package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071829.
 * @author Sean A. Irvine
 */
public class A071846 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).add(Functions.PHI.z(Functions.REVERSE.l(mN))).equals(Functions.SIGMA.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
